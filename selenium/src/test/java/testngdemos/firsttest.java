package testngdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firsttest {
	
	public String basicurl="http://newtours.demoaut.com/";
	String chromepath="C:\\Users\\Training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
	public WebDriver driver;
	
    @Test(priority=1)
    public void verifyHomepageTitle() {
    	System.out.println("launching firefox browser");
    	System.setProperty("webdriver.chrome.driver", chromepath);
    	driver=new ChromeDriver();
    	driver.get(basicurl);
    	String expectedtitle="Welcome: Mercury Tours";
    	String actualtitle=driver.getTitle();
    	Assert.assertEquals(actualtitle, expectedtitle);
    	driver.close();
  }
}
