package samplemaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class FirefoxDriverScript {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://www.google.com");
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
