package DropdownsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownDeparture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		// click departure
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//click  departure city
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		/*
		// click arrival
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
				
		//click  arrival city
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		*/
		
		
		//instead of using index traverse to parent-child
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
				
		driver.close();
		
	
	}

}
