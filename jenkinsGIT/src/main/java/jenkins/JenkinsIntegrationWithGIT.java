package jenkins;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

public class JenkinsIntegrationWithGIT {
    @Test
	void JenkinsIntegrationWithGITMethod()
	{
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		  	 String Str=dtf.format(now);
		System.out.println("JenkinsIntegrationWithGIT :"+dtf.format(now));

	}

}
