package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class ReviewSentimentAnalysisControllerGetApi extends genricUtilities {
	@Test(groups="activityugcreview")
	public void GetReviewSentimentAnalysisByReviewId() {
		response=RestAssured.get("/activityugcreview/review_sentiment_analysis_api/"+reviewId);
		Testcase=437;
	}
	@Test(groups="activityugcreview")
	public void GetListOfReviewSentimentAnalysisForAllReviewsByEventId() {
		response=RestAssured.get("/activityugcreview/review_sentiment_analysis_api/event/"+eventId+"/list");
		Testcase=438;
		
	}

}
