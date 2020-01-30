package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sampletest {
	public String basicurl="http://newtours.demoaut.com/";
	String chromepath="C:\\Users\\Training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
	public WebDriver driver;
	
  @Test(priority=1)
  public void signonpage() {
  System.out.println("launching browser");
	System.setProperty("webdriver.chrome.driver", chromepath);
	driver=new ChromeDriver();
	driver.get(basicurl);
	driver.findElement(By.partialLinkText("SIGN-ON")).click();
	String expectedtitle="Sign-on: Mercury Tours";
	String actualtitle=driver.getTitle();
	Assert.assertEquals(actualtitle, expectedtitle);
	 driver.close();
	
  }
  @Test(priority=4)
  public void registerpage() {
  System.out.println("launching browser");
	System.setProperty("webdriver.chrome.driver", chromepath);
	driver=new ChromeDriver();
	driver.get(basicurl);
	driver.findElement(By.partialLinkText("REGISTER")).click();
	String expectedtitle="Register: Mercury Tours";
	String actualtitle=driver.getTitle();
	Assert.assertEquals(actualtitle, expectedtitle);
	 driver.close();
	
  }

  @Test(priority=3)
  public void supportpage() {
  System.out.println("launching browser");
	System.setProperty("webdriver.chrome.driver", chromepath);
	driver=new ChromeDriver();
	driver.get(basicurl);
	driver.findElement(By.partialLinkText("SUPPORT")).click();
	String expectedtitle="Under Construction: Mercury Tours";
	String actualtitle=driver.getTitle();
	Assert.assertEquals(actualtitle, expectedtitle);
	 driver.close();
  }

  @Test(priority=2)
  public void contactpage() {
  System.out.println("launching browser");
	System.setProperty("webdriver.chrome.driver", chromepath);
	driver=new ChromeDriver();
	driver.get(basicurl);
	driver.findElement(By.partialLinkText("CONTACT")).click();
	String expectedtitle="Under Construction: Mercury Tours";
	String actualtitle=driver.getTitle();
	Assert.assertEquals(actualtitle, expectedtitle);
	 driver.close();
	
  }
 
}