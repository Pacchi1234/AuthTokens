package com.ripplestreet.AuthTokens;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class AuthTokens extends genricUtilities {
	
	public void authToken1(int Testcase) throws IOException {
		RestAssured.baseURI = baseURI;
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName);
		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(1);
		PutBody = cell2.getStringCellValue();
		response = RestAssured.given().contentType(ContentType.JSON).body(PutBody).when().post("auth/login");
		String responseBody = response.asString();
		JsonPath jsonPath = new JsonPath(responseBody);
		AccessToken = jsonPath.getString("accessToken");
		System.out.println("AccessToken is =" + AccessToken);
		fis.close();
		FileInputStream fis1 = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook1 = new XSSFWorkbook(fis1);
		XSSFSheet sheet1 = workbook1.getSheet(ExcelSheetPageName);
		FileOutputStream fio = new FileOutputStream(file);
		XSSFRow row1 = sheet1.getRow(Testcase);
		XSSFCell cell1 = row1.getCell(2);
		cell1.setCellValue(AccessToken);
		int statusCode = response.statusCode();
		XSSFCell cell = row1.getCell(3);
		cell.setCellValue(statusCode);
		workbook1.write(fio);
		fio.close();
		fis1.close();
	}

	public static void main(String[] args) throws IOException {
		AuthTokens auth = new AuthTokens();
		for (int testCase = 1; testCase <= 332; testCase++) {
			auth.authToken1(testCase);
		}
	}

}