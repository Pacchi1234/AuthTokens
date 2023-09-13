package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class MobileAppEventControllerGetApi extends genricUtilities {
	@Test(groups="event")
	public void discovermobileEvents() {
		response = RestAssured.given().get("/event/v1/discover/events/list?page=&size=10&eventType=APPLY");
		System.out.println(eventType);
		Testcase=405;
	}
	@Test(groups="event")
	public void getMobileEventHeroPlaylists() {
		response=RestAssured.get("/event/v1/app/heroplaylist?eventIds="+eventId);
		Testcase=434;
	}
	@Test(groups="event")
	public void getMobileEventDetailBySlugAndPersonId() {
		response=RestAssured.get("/event/v1/discover/event/"+slug);
		Testcase=435;
		
	}
}
