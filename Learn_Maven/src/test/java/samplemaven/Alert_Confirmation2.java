package samplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alert_Confirmation2 {
	public WebDriver driver;
	@Test
	public void testAlert_Confirmation() throws InterruptedException {
		driver.get("http://www.tizag.com/javascriptT/javascriptconfirm.php");
		driver.findElement(By.xpath("//input[@value='Leave Tizag.com']")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
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
