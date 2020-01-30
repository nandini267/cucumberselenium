package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class module6 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  Actions action=new Actions(driver);
	  action.moveToElement(driver.findElement(By.partialLinkText("AboutUs"))).perform();
	  action.moveToElement(driver.findElement(By.partialLinkText("Our Offices"))).perform();
	  action.moveToElement(driver.findElement(By.partialLinkText("Chennai"))).click().perform();
	//  Assert.assertEquals(driver.getTitle(),"Contact Us");
	  //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  String address=driver.findElement(By.id("demo3")).getText();
	  System.out.println(address);
	  Assert.assertTrue(address.contains("Chennai"));
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.07\\eclipse-workspaceb6b\\cucumber\\src\\test\\resources\\drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
