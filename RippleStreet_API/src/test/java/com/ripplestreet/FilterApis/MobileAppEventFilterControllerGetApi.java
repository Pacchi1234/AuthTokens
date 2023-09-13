package com.ripplestreet.FilterApis;

import java.io.IOException;
import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class MobileAppEventFilterControllerGetApi extends genricUtilities {

	@Test(groups="event")
	public void discoverMobileEvent() throws NumberFormatException, IOException {
		Testcase = 406;
		for (String Mobilevent : mobileEventType) {
			response = RestAssured.given().queryParam("page", page, "size", size)
					.get("/event/v1/discover/events/list?eventType=" + Mobilevent);
			System.out.println(Mobilevent);
			genricUtilities.StatusCode();
			Testcase++;
		}
	}
}
