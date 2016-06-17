package samplemaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Dropdown_Test {
	public WebDriver driver;
	@Test
	public void testDropdown_Test() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement dd=driver.findElement(By.id("month"));
		Select s = new Select(dd);
		//select by Index
		s.selectByIndex(5);
		Thread.sleep(2000);
		//select by Visible Text
		s.selectByVisibleText("Sept");
		Thread.sleep(2000);
		//select by Value
		s.selectByValue("12");
		Thread.sleep(2000);

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
