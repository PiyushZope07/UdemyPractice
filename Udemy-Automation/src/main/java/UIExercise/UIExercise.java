package UIExercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Rahul Shetty");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rahulshettyacademy@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement dropdownselect = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select dropdown = new Select(dropdownselect);
		dropdown.selectByVisibleText("Female");
		
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("12/23/22");
		
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert-dismissible']")).getText());
		
	}

}
