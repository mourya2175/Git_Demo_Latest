package samplemaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Basics_Test {
	public WebDriver driver;
  @Test
  public void testBasics_Test() {
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.id("email")).sendKeys("testselenium@gmail.com");
	  driver.findElement(By.xpath("//span[@id='u_0_h']/span[1]/input")).click();
	  driver.findElement(By.name("websubmit")).click();
	  driver.findElement(By.linkText("Create a Page")).click();
	  Thread.sleep(5000);
	  
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
