package Calendar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// click departure
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
				
		//click  departure city
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		//instead of using index traverse to parent-child
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
						
		driver.findElement(By.linkText("9")).click();
		
		
		
	}
	
}
