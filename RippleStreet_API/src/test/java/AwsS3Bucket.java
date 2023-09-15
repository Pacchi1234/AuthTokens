import java.io.File;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.TransferManagerBuilder;
import com.amazonaws.services.s3.transfer.Upload;

public class AwsS3Bucket {
	public static void main(String[] args) throws AmazonServiceException, AmazonClientException, InterruptedException {
		// Replace these with your AWS S3 credentials and bucket information
		String accessKey = "AKIASSI22RH3T2Z3X2OV";
		String secretKey = "bkkXHa4zhjJzPJd5ABMxQI11hBVgi05L+nVojAE8";
		String bucketName = "rs-api-tests2	";
		@SuppressWarnings("unused")
		String folderName = "Api Automation"; // Specify the folder name
		String localDirectoryPath = "C:\\Users\\Prashanthchigarer\\Desktop\\git\\ripplestreet-automation-testing\\RippleStreet_API\\src\\test\\resources\\config\\postApi.xlsx";
		// Create AWS S3 client
		if(bucketName.equals("rs-api-tests")) {
			System.out.println("Specified Bucekt is Found");
		}else {
			System.out.println("No such Bucekt Found");
		}
        BasicAWSCredentials awsCreds = new BasicAWSCredentials(accessKey, secretKey);
        AmazonS3 s3Client = AmazonS3Client.builder()
                .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
                .build();

        // Create a TransferManager
        TransferManager transferManager = TransferManagerBuilder.standard()
                .withS3Client(s3Client)
                .build();

        try {
            // List all files in the local directory
            File localDirectory = new File(localDirectoryPath);
            File[] files = localDirectory.listFiles();
            
            if (files != null) {
                // Upload all files to the S3 bucket
                for (File file : files) {
                    if (file.isFile()) {
                        String objectKey = file.getName();
                        Upload upload = transferManager.upload(bucketName, objectKey, file);
                        upload.waitForCompletion();
                        System.out.println("File uploaded to S3: " + objectKey);
                    }
                } 
            }

            System.out.println("Files uploaded to S3 successfully!");

        
        } finally { 
            // Shutdown the TransferManager when doneL                                                                                                                                                                                                                                                                                                                                                                                                                         
           transferManager.shutdownNow();
        }
	}
}
