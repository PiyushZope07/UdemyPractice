package CheckBoxPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//check first checkbox
		
		WebElement checkbox= driver.findElement(By.id("checkBoxOption1"));
		
		checkbox.click();
		
		System.out.println(checkbox.isSelected());
		
		// uncheck
		checkbox.click();
		
		System.out.println(checkbox.isSelected());
		
		//get count of checkboxes
		
		List<WebElement> count=driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		System.out.println(count.size());
	
	}

	
}
