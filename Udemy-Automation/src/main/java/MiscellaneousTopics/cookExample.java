package MiscellaneousTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new  ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		

	}

}
