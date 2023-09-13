package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;
import java.io.*;

public class EventControllerGetApi extends genricUtilities  {

	@Test(priority = 1, groups = "event")
	public void getAllCurrentMileStoneByEvent() throws IOException {

		RestAssured.baseURI = baseURI;
		
		response = RestAssured.given().when().get("/event/events/getAllCurrentMileStonesByEvent/" + eventId);
		Testcase = 1;

	}

	@Test(groups = "event")
	public void getAllEvents() {
		response = RestAssured.given().param("eventId", eventId).param("page", page).param("size", size).when()
				.get("/event/events/getAllEvents/_search");
		Testcase = 2;

	}

	@Test(priority = 3, groups = "event")
	public void getAllMileStonesByEvent() {
		response = RestAssured.given().when().get("/event/events/getAllMilestonesByEvent/" + eventId);
		System.out.println(eventId);
		Testcase = 3;
	}

	@Test(priority = 4, groups = "event")
	public void getAllProductByEvents() {
		response = RestAssured.given().when().get("/event/events/getAllProductsByEvent/" + eventId);
		Testcase = 4;
	}

	@Test(priority = 5, groups = "event")
	public void getAllServices() {
		response = RestAssured.given().when().get("/event/events/getAllServices");
		Testcase = 5;
	}

	@Test(priority = 6, groups = "event")
	public void getAllSubscriptionsByEvent() {
		response = RestAssured.given().when().get("/event/events/getAllSubscriptionsByEvent/" + eventId);
		Testcase = 6;

	}

	@Test(priority = 7, groups = "event")
	public void getAllSubscriptionsByServiceName() {
		response = RestAssured.given().when().get("/event/events/getAllSubscriptionsByServiceName/" + activitiesName);
		System.out.println(activitiesName);
		Testcase = 7;
	}
	@Test(priority = 8, groups = "event")
	public void getEventById() {
		response = RestAssured.given().when().get("/event/events/getEventById/" + eventId);
		Testcase = 8;

	}

	@Test(priority = 9, groups = "event")
	public void getEventDetailBySlug() {
		response = RestAssured.given().when().get("/event/events/getEventDetailBySlug/" + slug);
		Testcase = 9;
	}

	@Test(priority = 10, groups = "event")
	public void getProductDetailEventIdAndProductId() {
		response = RestAssured.given().when().param("eventId", eventId).param("productId", productId)
				.get("/event/events/getProductDetailEventIdAndProductId");
		Testcase = 10;
	}

	@Test(priority = 11, groups = "event")
	public void getpackAndApplicationCountByEventId() {
		response = RestAssured.given().when().get("/event/events/packAndApplicationCountByEventId/" + eventId);
		System.out.println();
		Testcase = 11;
	}

	@Test(priority = 12, groups = "event")
	public void getByEventName() {
		response = RestAssured.given().when().get("/event/events/getByEventName/" + eventName);
		Testcase = 12;

	}

	@Test(priority = 13, groups = "event")
	public void getCurrentMileStonesByEvent() {
		response = RestAssured.given().when().get("/event/events/getCurrentMilestoneByEvent/" + eventId);
		Testcase = 13;

	}

	@Test(priority = 14, groups = "event")
	public void getEventDetailForWorkFlow() {
		response = RestAssured.given().when().get("/event/events/getEventDetail/" + eventId + "/" + pid);
		Testcase = 188;

	}

	@Test(priority = 189, groups = "event")
	public void getFilteredEvents() {
		RestAssured.baseURI = baseURI;
		response = RestAssured.given().queryParams("eventId", eventId, "page", page, "size", size)
				.get("/event/events/getAllEvents/_search");
		Testcase = 189;
	}

	@Test(priority = 190, groups = "event")
	public void getEventMileStoneByIdAndDate() {

		response = RestAssured.given().queryParams("eventId", eventId, "created", eventCreatedDate)
				.get("/event/events/getEventMileStoneByIdAndDate");
		Testcase = 190;

	}

	@Test(groups = "event")
	public void getAllSpotLightEventDetail() {

		response = RestAssured.given().get("/event/events/getAllSpotLightEventDetail");
		Testcase = 396;

	}

	@Test(groups = "event")
	public void getEventDetailforWorkflow() {
		response = RestAssured.given().get("/event/events/getEventDetail/" + eventId + "/" + pid);
		Testcase = 397;

	}

	@Test(groups = "event")
	public void getStatus() {
		response = RestAssured.get("/event/v1/getStatus?eventId=" + eventId + "&pid=" + pid);
		Testcase = 415;
		// Event Status Controller
	}

}
