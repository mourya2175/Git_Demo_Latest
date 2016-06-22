package samplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alert_Confirmation {
	public WebDriver driver;
	@Test
	public void testAlert_Confirmation() throws InterruptedException {
		driver.get("http://www.kesinenitravels.com/");
		driver.findElement(By.id("ctl00_ibtnCheckFare")).click();
		driver.findElement(By.id("ctl00_cpEndUserMain_ibtnSearch")).click();
		Thread.sleep(2000);
		//get alert text
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println("Alert message is : "+alertmsg);
		//handle alert
		driver.switchTo().alert().accept();
		//cancel button
//		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("ctl00_ibtnLogIn")).click();
		
		
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
