package com.ripplestreet.genricUtilities;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.ripplestreet.AllGetApis.UgcControllerGetApi;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class genricUtilities {
	public static String baseURI = ConfigFileReader.getInstance().getBaseURI();
	public static String eventId = ConfigFileReader.getInstance().getEventId();
	public static String page = ConfigFileReader.getInstance().getPage();
	public static String size = ConfigFileReader.getInstance().getSize();
	public String activitiesName = ConfigFileReader.getInstance().getActivitiesName();
	public String pid = ConfigFileReader.getInstance().getPid();
	public String slug = ConfigFileReader.getInstance().getSlugValue();
	public String productId = ConfigFileReader.getInstance().getProductId();
	public String eventName = ConfigFileReader.getInstance().getByEventName();
	public static String devApiPath = ConfigFileReader.getInstance().getdevApiPath();
	public String packCount = ConfigFileReader.getInstance().getpackCount();
	public String feedItemId = ConfigFileReader.getInstance().getfeedItemId();
	public static String ExcelSheetPageName = ConfigFileReader.getInstance().getExcelSheetPageName();
	public String feedType = ConfigFileReader.getInstance().getfeedType();
	public String discussion_id = ConfigFileReader.getInstance().getdiscussion_id();
	public String model = ConfigFileReader.getInstance().getmodel();
	public String comment = ConfigFileReader.getInstance().getcomment();
	public String ipAddress = ConfigFileReader.getInstance().getipAddress();
	public String ugctaskId = ConfigFileReader.getInstance().getugcTaskId();
	public String ugcId = ConfigFileReader.getInstance().ugcId();
	public String assetId = ConfigFileReader.getInstance().getAssetId();
	public String reviewId = ConfigFileReader.getInstance().getreviewId();
	public String activityId = ConfigFileReader.getInstance().getactivityId();
	public String activitygroupId = ConfigFileReader.getInstance().getactivitygroupId();
	public String taskId = ConfigFileReader.getInstance().gettaskId();
	public String status = ConfigFileReader.getInstance().getstatus();
	public String segmentId = ConfigFileReader.getInstance().getsegmentId();
	public String segmentName = ConfigFileReader.getInstance().getsegmentName();
	public String folderId = ConfigFileReader.getInstance().getFolderId();
	public String segmentationtriggerId = ConfigFileReader.getInstance().getsegmentationtriggerId();
	public String tableName = ConfigFileReader.getInstance().gettableName();
	public String operation = ConfigFileReader.getInstance().getoperation();
	public String gamificationActivityId = ConfigFileReader.getInstance().getgamificationActivityId();
	public static String columnName = ConfigFileReader.getInstance().getcolumnName();
	public static String directionDESC = ConfigFileReader.getInstance().getdirectionDESC();
	public static String gamespageNo = ConfigFileReader.getInstance().getgamespageNo();
	public String gameId = ConfigFileReader.getInstance().getgameId();
	public String gameSlug = ConfigFileReader.getInstance().getgameSlug();
	public String jobId = ConfigFileReader.getInstance().getjobId();
	public String sourceType = ConfigFileReader.getInstance().getsourceType();
	public String receiptId = ConfigFileReader.getInstance().getreceiptId();
	public String collectionName = ConfigFileReader.getInstance().getcollectionName();
	public String optInId = ConfigFileReader.getInstance().getoptInId();
	public String rewardAllocationId = ConfigFileReader.getInstance().getrewardAllocationId();
	public String rewardId = ConfigFileReader.getInstance().getrewardId();
	public String rewardName = ConfigFileReader.getInstance().getrewardName();
	public String deliveryType = ConfigFileReader.getInstance().getdeliveryType();
	public String swagId = ConfigFileReader.getInstance().getswagId();
	public String notificationId = ConfigFileReader.getInstance().getnotificationId();
	public String campaignName = ConfigFileReader.getInstance().getcampaignName();
	public String email = ConfigFileReader.getInstance().getemail();
	public String templateName = ConfigFileReader.getInstance().gettemplateName();
	public String templateType = ConfigFileReader.getInstance().gettemplateType();
	public String templateTypeEnum = ConfigFileReader.getInstance().gettemplateTypeEnum();
	public String transactionlType = ConfigFileReader.getInstance().gettransactionType();
	public String fileName = ConfigFileReader.getInstance().getFileName();
	public String transactionTemplateId = ConfigFileReader.getInstance().gettransactionTemplateId();
	public String matrixNotificationId = ConfigFileReader.getInstance().getmatrixNotificationId();
	public String agencyId = ConfigFileReader.getInstance().getagencyId();
	public String playlistId = ConfigFileReader.getInstance().getplaylistId();
	public String bannerId = ConfigFileReader.getInstance().getbannerId();
	public String favorId = ConfigFileReader.getInstance().getfavorId();
	public String milestoneId = ConfigFileReader.getInstance().getmilestoneId();
	public String eventType = ConfigFileReader.getInstance().geteventtype();
	public String faqId = ConfigFileReader.getInstance().getfaqId();
	public String faqtopicId = ConfigFileReader.getInstance().getfaqtopicId();
	public String roleId = ConfigFileReader.getInstance().getrolId();
	public String sponsorId = ConfigFileReader.getInstance().getsponsorId();
	public String surveyType = ConfigFileReader.getInstance().getsurveyType();
	public String linkId = ConfigFileReader.getInstance().getlinkId();
	public String templateId = ConfigFileReader.getInstance().gettemplateId();
	public String eventCreatedDate = ConfigFileReader.getInstance().geteventCreatedDate();
	public String achievementId = ConfigFileReader.getInstance().getachievementId();
	public String triggerId = ConfigFileReader.getInstance().gettriggerId();
	public String AchievementProgramId = ConfigFileReader.getInstance().getAchievementProgramId();
	public String benifitType = ConfigFileReader.getInstance().getbenifitType();
	public String campaignId = ConfigFileReader.getInstance().getcampaignId();
	public String directionASC = ConfigFileReader.getInstance().getdirectionASC();
	public static String evnetTypeUpcomingEvents = ConfigFileReader.getInstance().getevnetTypeUpcomingEvents();
	public static String eventTypeOpenEvents = ConfigFileReader.getInstance().geteventTypeOpenEvents();
	public static String eventTypeCurrentEvents = ConfigFileReader.getInstance().geteventTypeCurrentEvents();
	public static String eventTypePastEvents = ConfigFileReader.getInstance().geteventTypePastEvents();
	public String amazoneURI = ConfigFileReader.getInstance().getAmazonBaseURL();
	public String id = ConfigFileReader.getInstance().getdiscussion_id();
	public String commentId = ConfigFileReader.getInstance().getcommentId();
	public String updateCommentbody = ConfigFileReader.getInstance().getupdateCommentbody();
	public String isActive = ConfigFileReader.getInstance().getisActive();
	public String serviceId = ConfigFileReader.getInstance().getserviceId();
	public String subscriptionId = ConfigFileReader.getInstance().getsubscriptionId();
	public String isSponsorSubscribed = ConfigFileReader.getInstance().getisSponsorSubscribed();
	public String applicationId = ConfigFileReader.getInstance().getapplicationId();
	public String putBenefitId = ConfigFileReader.getInstance().getputBenefitId();
	public String description = ConfigFileReader.getInstance().getdescription();
	public String segmentJobId = ConfigFileReader.getInstance().getsegmentJobId();
	public String gameoptionId = ConfigFileReader.getInstance().getgameoptionId();
	public String rewardAllocationstatus = ConfigFileReader.getInstance().getrewardAllocationstatus();
	public String rewardAllocationItemId = ConfigFileReader.getInstance().getrewardAllocationItemId();
	public String deliveryItemId = ConfigFileReader.getInstance().getdeliveryItemId();
	public String rewardItemId = ConfigFileReader.getInstance().getrewardItemId();
	public String putNotificationId = ConfigFileReader.getInstance().getputNotificationId();
	public String publishStatus = ConfigFileReader.getInstance().getpublishStatus();
	public String updateTemplateId = ConfigFileReader.getInstance().getupdateTemplateId();
	public String isSuppressed = ConfigFileReader.getInstance().getisSuppressed();
	public String putAssetId = ConfigFileReader.getInstance().getputAssetId();
	public String updateEventMileStoneId = ConfigFileReader.getInstance().getupdateEventMileStoneId();
	public String targetId = ConfigFileReader.getInstance().gettargetId();
	public String PutFAQID = ConfigFileReader.getInstance().getPutFAQID();
	public String goalId = ConfigFileReader.getInstance().getgoalId();
	public static String ExcelSheetPageName2 = ConfigFileReader.getInstance().getExcelSheetPageName2();
	public static String isNotificationSendRequired = ConfigFileReader.getInstance().getisNotificationSendRequired();
	public static String reserved = ConfigFileReader.getInstance().getReserved();
	public static String AudiencePromotionJobID = ConfigFileReader.getInstance().getAudiencePromotionJobID();
	public static String AudiencePromotionColumnName = ConfigFileReader.getInstance().getAudiencePromotionColumnName();
	public static String AudiencePromotionJobfailedPidsCount = ConfigFileReader.getInstance()
			.getAudiencePromotionJobfailedPidsCount();
	public static String AudiencePromotionJobprocessedPidsCount = ConfigFileReader.getInstance()
			.getAudiencePromotionJobfailedPidsCount();
	public static String gameName = ConfigFileReader.getInstance().getgameName();
	public static String reviwtaskId = ConfigFileReader.getInstance().getreviwTaskId();
	public static String goalCount = ConfigFileReader.getInstance().getgoalCount();
	public static String ImageRecoginitionActivityId = ConfigFileReader.getInstance().getImageRecoginitionActivityId();
	public static String ImageRecoginitionActivityGroupId = ConfigFileReader.getInstance()
			.getImageRecoginitionActivityGroupId();
	public static String feedbackReason = ConfigFileReader.getInstance().getfeedbackReason();
	public static String moderationReason = ConfigFileReader.getInstance().getmoderationReason();

	public String PutBody = null;
	public static Response response;
	public static int Testcase;
	@SuppressWarnings("rawtypes")
	public List ls = new ArrayList();
	@SuppressWarnings("rawtypes")
	public LinkedHashMap map1 = new LinkedHashMap<Object, Object>();
	@SuppressWarnings("rawtypes")
	public LinkedHashMap map2 = new LinkedHashMap<Object, Object>();
	@SuppressWarnings("rawtypes")
	public HashMap map3 = new HashMap<Object, Object>();
	public List<String> SourceType = Arrays.asList("STORE_GEO_CODING", "SEGMENT_STORE_GEO_CODING", "REWARD_ALLOCATION",
			"EXPORT_AUDIENCE", "EXPORT_ACTIVITY_CONFIG", "EXPORT_REWARD_PREFERENCE", "EXPORT_REWARD_ALLOCATION",
			"EXPORT_REWARD_DELIVERY", "EXPORT_SEGMENT_DATA", "EXPORT_COMMUNITY", "EXPORT_UGC_VIDEO", "EXPORT_UGC_PHOTO",
			"EXPORT_UGC_DISCUSSION", "EXPORT_UGC_REVIEW", "EXPORT_UGC_EXTERNALREVIEW");
	public List<String> rewardType = Arrays.asList("PACK", "REIMBURSEMENT", "HYBRID");
	public List<String> RewardStatus = Arrays.asList("INITIATED", "INPROGRESS", "READY_FOR_DELIVERY", "DELIVERED",
			"PARTIAL_DELIVERED", "FAILED", "PENDING_APPROVAL", "CANCELLED", "EXPIRED", "REWARDED");
	public List<String> receiptstatus = Arrays.asList("INITIATED", "APPROVED", "PENDING", "REJECTED");
	public List<String> evenTypes = Arrays.asList("UPCOMINGEVENTS", "OPENEVENTS", "CURRENTEVENTS", "PASTEVENTS");
	public List<String> booleanValues = Arrays.asList("TRUE", "FALSE");
	public List<String> FeedTypes = Arrays.asList("Discussion", "SocialAsset", "Review");
	public List<String> BenefitType = Arrays.asList("ALL", "BADGE", "STATUS");
	public List<String> participantType = Arrays.asList("All", "Host", "Chatterbox", "Applicant", "Reserved", "Reject",
			"Finalist");
	public List<String> segmentStatus = Arrays.asList("DRAFT", "PUBLISH", "UNPUBLISH");
	public String body = "{\"clientId\":\"2a42a243ee3549fdf08368578be6b0a8dffed0e1\",\"email\":\"lalithac+111@nu10.co\",\"password\":\"L@litha123\"}";
	public List<String> mobileEventType = Arrays.asList("APPLY", "APPLIED", "SELECTED", "PAST");
	public List<String> entityName = Arrays.asList("CAMPAIGN", "SPONSOR", "DISCUSSION", "EXTERNAL_REVIEW",
			"REWARD_PREFERENCE", "SEGMENT", "RECEIPT", "AUDIENCE", "PARTY");
	public String AccessToken = null;
	public static File file = new File(devApiPath);

	@BeforeSuite
	public void authToken() {
		try {
			response = RestAssured.given().contentType(ContentType.JSON).body(body)
					.post("https://dev.ripplestreet.com/auth/login");
			String responseBody = response.asString();
			JsonPath jsonPath = new JsonPath(responseBody);
			System.out.println(responseBody);
			AccessToken = jsonPath.getString("accessToken");
			System.out.println("AccsessToken is =" + AccessToken);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void BaseURI() throws InterruptedException {
		RestAssured.baseURI = baseURI;
	}

	@SuppressWarnings("unlikely-arg-type")
	@AfterMethod
	public static void StatusCode() throws IOException, NumberFormatException {
		File file = new File(devApiPath);
		int statuscode = response.statusCode();
		if (statuscode == 200 || statuscode == 201 || statuscode == 302 || statuscode == 202) {
			System.out.println("status code is" + statuscode);
		} else if (statuscode == 400) {
			System.err.println("status code is 400");
		} else {
			System.err.println("status code is 500");
		}
		String ActualOutput = response.asString();
		int contentLength = ActualOutput.length();
		if (contentLength > 32767) {
			System.out.println("Cannot invoke more than 32767 Charecters in the Cell");
		} else {
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName);
			XSSFRow row = sheet.getRow(Testcase);
			XSSFCell cell = row.getCell(2);
			System.out.println("Actual output is" + ActualOutput);
			System.out.println("Expected Output is " + cell);
			FileOutputStream fio = new FileOutputStream(file);
			XSSFRow row1 = sheet.getRow(Testcase);
			XSSFCell cell1 = row1.getCell(3);
			cell1.setCellValue(ActualOutput);
			XSSFCell cell2 = row1.getCell(5);
			cell2.setCellValue(statuscode);

			if (cell != null) {
				switch (cell.getCellType()) {
				case STRING:
					String StringCellValue = cell.getStringCellValue();
					if (StringCellValue.equals(ActualOutput)) {
						System.err.println("Testcase " + Testcase + " " + "has been Passed");
						XSSFCell passOrFail = row.getCell(6);
						passOrFail.setCellValue("Pass");
					} else {
						System.err.println("Tseatcase " + Testcase + "is Mismatching");
						XSSFCell passOrFail = row.getCell(6);
						passOrFail.setCellValue("Fail");
					}
					break;
				case NUMERIC:
					Double NumericCellValue = cell.getNumericCellValue();
					if (NumericCellValue.equals(ActualOutput)) {
						System.out.println("Testcase is Passed");
						XSSFCell passOrFail = row.getCell(6);
						passOrFail.setCellValue("Pass");
					} else {
						System.out.println("Test Output is Mismatching");
						XSSFCell passOrFail = row.getCell(6);
						passOrFail.setCellValue("Fail");
					}
					break;
				case BOOLEAN:
					Boolean BooleanCellValue = cell.getBooleanCellValue();
					if (BooleanCellValue.equals(ActualOutput)) {
						System.out.println("Testcase is Passed");
						XSSFCell passOrFail = row.getCell(6);
						passOrFail.setCellValue("Pass");
					} else {
						System.out.println("Test Output is Mismatching");
						XSSFCell passOrFail = row.getCell(6);
						passOrFail.setCellValue("Fail");
					}
					break;
				default:
					break;
				}
			}
			if (cell != null) {
				workbook.write(fio);
			}
			workbook.close();
			fio.close();

		}

	}
}
