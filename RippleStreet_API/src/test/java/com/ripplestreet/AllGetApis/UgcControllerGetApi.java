package com.ripplestreet.AllGetApis;

import java.io.IOException;
import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class UgcControllerGetApi extends genricUtilities {
	public static boolean flag = false;

	@Test(groups = "activityugcreview")
	public void getUgcDetailsByTaskId() {
		flag = false;
		response = RestAssured.given().when().get("/activityugcreview/client_api/GetUgcByTaskId/" + ugctaskId);
		Testcase = 49;

	}

	@Test(groups = "activityugcreview")
	public void downloadAsset() throws IOException {
		flag = true;
		response = RestAssured.given().when().get("/activityugcreview/client_api/downloadAsset?assetId=" + assetId);
		Testcase = 50;
	}

	@Test(priority = 51, groups = "activityugcreview")
	public void downloadAssetByURL() {
		flag = false;
		response = RestAssured.given().when()
				.get("/activityugcreview/client_api/downloadAssetByURL?assetId=" + assetId);
		Testcase = 51;
	}

	@Test(priority = 52, groups = "activityugcreview")
	public void getImageRecognitionResponse() {
		flag = false;
		response = RestAssured.given().when()
				.get("/activityugcreview/client_api/getImageRecognition?eventId=" + eventId);
		Testcase = 52;
	}

	@Test(priority = 53, groups = "activityugcreview")
	public void getUgcDetailsById() {
		flag = false;
		response = RestAssured.given().when().get("/activityugcreview/client_api/getUgcDetailsById/" + ugcId);
		Testcase = 53;

	}

	@Test(priority = 54, groups = "activityugcreview")
	public void getUserAsset() {
		flag = false;
		response = RestAssured.given().when().get("/activityugcreview/client_api/getUserAsset?eventId=" + eventId);
		Testcase = 54;
	}

}
