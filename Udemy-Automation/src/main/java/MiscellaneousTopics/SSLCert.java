package MiscellaneousTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//used to set behaviour of chromedriver
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com");
		
		System.out.println(driver.getTitle());
		
	}

}
