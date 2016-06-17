package samplemaven;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dropdown_Count {
	public WebDriver driver;
	@Test
	public void testDropdown_Count() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement dd=driver.findElement(By.id("month"));
		List<WebElement> values=dd.findElements(By.tagName("option"));
		System.out.println("Number of values in DD : "+values.size());
		
		for (int i = 0; i < values.size(); i++) {
			
			System.out.println("Values are : "+values.get(i).getText());
		}

	}
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
