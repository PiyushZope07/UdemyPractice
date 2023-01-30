package DropdownsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdownAdults {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//click on adult Dropdown to select
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		//Get text of number of adults
		System.out.println(	driver.findElement(By.id("divpaxinfo")).getText());
		
		//click on + button to increase number of adults
		for(int i=0;i<4;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		//click on done 
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Get text of number of adults after clicking +
		System.out.println(	driver.findElement(By.id("divpaxinfo")).getText());



	}

}
