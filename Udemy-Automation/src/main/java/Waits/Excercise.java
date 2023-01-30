package Waits;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String[] itemsNeeded = { "iphone X", "Samsung Note 8", "Nokia Edge","Blackberry" };


		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.cssSelector("input[value='user']")).click();

		WebElement okay = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));

		okay.click();

		WebElement dropdown = driver.findElement(By.cssSelector("select.form-control"));

		Select s = new Select(dropdown);

		s.selectByIndex(2);
		
		driver.findElement(By.id("terms")).click();
		

		WebElement signin = w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#signInBtn")));
		signin.click();
		
		//addProducts(driver, itemsNeeded);
		
		  List <WebElement> products = driver.findElements(By.cssSelector("button[class='btn btn-info']"));



		    for(int i=0;i<products.size();i++)



		    {



		    products.get(i).click();



		    }

		    



		    driver.findElement(By.partialLinkText("Checkout")).click();

		   

		
		
		driver.findElement(By.cssSelector("a[class*='btn-primary']")).click();
	}

	}
	
	