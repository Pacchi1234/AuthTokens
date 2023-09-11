package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class ClickTheLinkControllerGetApi extends genricUtilities {
	@Test
	public void getAllLinks() {
		response=RestAssured.get("/activityugcreview/client_api/getAllLinks");
		Testcase=431;
		
	}

}
