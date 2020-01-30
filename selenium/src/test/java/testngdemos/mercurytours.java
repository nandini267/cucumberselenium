package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class mercurytours {
  @Test(dataProvider="dp")
  public void testlogin(String user,String pwd,String cnfmpwd) {
	  String chromepath="C:\\Users\\Training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromepath);
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://demoaut.com/");
	  
	  driver.findElement(By.partialLinkText("REGISTER")).click();
	  
	  driver.findElement(By.name("email")).sendKeys(user);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("confirmPassword")).sendKeys(cnfmpwd);
	  driver.close();
  }
@DataProvider
public Object[][] dp() {
	return new Object[][] {
			new Object[] {"bmc","bmc123","bmc123"},
			new Object[] {"nandu","nan123","nan123"},
			new Object[] {"mani","mani123","mani123"},
	};
}
}