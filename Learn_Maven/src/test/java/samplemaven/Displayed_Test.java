package samplemaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Displayed_Test {
	public WebDriver driver;
  @Test
  public void testDisplayed_Test() {
	  driver.get("http://www.plus2net.com/javascript_tutorial/listbox-disabled-demo.php");
	  boolean statusbeforeselectingNO=driver.findElement(By.name("Category")).isDisplayed();
	  System.out.println("Status of DD before seelcting NO : "+statusbeforeselectingNO);
	  //select radio button NO
	  driver.findElement(By.xpath("//input[@value='no']")).click();
	  boolean statusafterselectingNO=driver.findElement(By.name("Category")).isDisplayed();
	  System.out.println("Status of DD after seelcting NO : "+statusafterselectingNO);
	  
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
