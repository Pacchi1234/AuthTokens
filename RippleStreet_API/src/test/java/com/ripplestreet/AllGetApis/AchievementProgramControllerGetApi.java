package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class AchievementProgramControllerGetApi extends genricUtilities {
	@Test(priority = 62, groups = "benefits-platform")
	public void GetListofAchievementPrograms() {
		RestAssured.baseURI = baseURI;
		response = RestAssured.get("/benefits-platform/v1/achievementProgram/list");
		Testcase = 62;

	}

	@Test(priority = 63, groups = "benefits-platform")
	public void GetListOfAchievementProgramsforAchievementId() {
		response=RestAssured.get("/benefits-platform/v1/achievementProgram/list/"+achievementId);
		Testcase=63;
		
	}
	@Test(priority=64,groups="benefits-platform")
	public void GetAchievementProgram() {
		response=RestAssured.get("/benefits-platform/v1/achievementProgram/"+AchievementProgramId);
		Testcase=64;
		
	}
	
	
	

}
