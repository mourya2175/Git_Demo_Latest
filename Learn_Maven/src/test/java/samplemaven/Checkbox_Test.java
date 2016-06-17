package samplemaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Checkbox_Test {
	public WebDriver driver;
  @Test
  public void testCheckbox_Test() throws InterruptedException {
	  
	  driver.get("http://www.rightstart.com/");
	  driver.findElement(By.partialLinkText("Email")).click();
	  Boolean status=driver.findElement(By.cssSelector("input[id='signup:PrefOnlinePromo']")).isSelected();
	  if(status)
	  {
		  System.out.println("Check box is already checked");
	  }
	  else
	  {
		  System.out.println("Check box is not checked now i am checking");
		  driver.findElement(By.cssSelector("input[id='signup:PrefOnlinePromo']")).click(); 
	  }
	 
	  driver.findElement(By.cssSelector("input[id='signup:PrefRetailPromo']")).click();
	  Thread.sleep(5000);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
