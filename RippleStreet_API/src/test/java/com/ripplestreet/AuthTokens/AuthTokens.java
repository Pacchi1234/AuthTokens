package com.ripplestreet.AuthTokens;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class AuthTokens extends genricUtilities {

	public void authToken(int Testcase) throws IOException {
		RestAssured.baseURI = baseURI;
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName);
		XSSFRow row = sheet.getRow(Testcase);
		XSSFCell cell = row.getCell(0);
		fis.close();
		PutBody = cell.getStringCellValue();
		String body = "{\"clientId\":\"2a42a243ee3549fdf08368578be6b0a8dffed0e1\",\"email\":\"" + PutBody
				+ "\",\"password\":\"L@litha123\"}";
		response = RestAssured.given().contentType(ContentType.JSON).body(body).when().post("auth/login");
		String responseBody = response.asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		System.out.println(responseBody);
		AccessToken = jsonPath.getString("accessToken");
		System.out.println("AccessToken is =" + AccessToken);
		fis.close();
		FileInputStream fis1 = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook1 = new XSSFWorkbook(fis1);
		XSSFSheet sheet1 = workbook1.getSheet(ExcelSheetPageName);
		FileOutputStream fio = new FileOutputStream(file);
		XSSFRow row1 = sheet1.getRow(Testcase);
		XSSFCell cell1 = row1.getCell(1);
		cell1.setCellValue(AccessToken);
		workbook1.write(fio);
		fio.close();
		fis1.close();
	}
	public static void main(String[] args) throws IOException {
		AuthTokens auth = new AuthTokens();
		for (int testCase = 1; testCase < 332; testCase++) {
			auth.authToken(testCase);
		}
	}

}