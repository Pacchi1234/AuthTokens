package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class ImageRecongnitionControllerGetApi extends genricUtilities {
	@Test(groups="activityugcreview")
	public void getImageValidationResponse() {

		response = RestAssured.given().header("Authorization", AccessToken)
				.get("/activityugcreview/image_recognition/imageValidation?activityGroupId="
						+ ImageRecoginitionActivityGroupId + "&activityId=" + ImageRecoginitionActivityId + "&eventId="
						+ eventId + "&fileName=" + fileName);
		Testcase = 432;
	}
}
