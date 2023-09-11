package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class ConfigurationController extends genricUtilities {
	@Test(priority=146,groups="event-campaign-manager")
	public void getAllconfigs() {
		response=RestAssured.get("/event-campaign-manager/v1/configuration/list");
		Testcase=146;
	}

}
