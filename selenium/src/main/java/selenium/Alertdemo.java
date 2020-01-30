package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) {
		
		String chromepath="C:\\Users\\Training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4");
	driver.findElement(By.name("uid")).sendKeys("nandu");
	    driver.findElement(By.name("password")).sendKeys("nandu123");
		driver.findElement(By.name("btnLogin")).submit();
		//driver.findElement(By.("Click Me!")).click();
		
		Alert alert=driver.switchTo().alert();
		String alertMessage=driver.switchTo().alert().getText();
		System.out.print(alertMessage);
		alert.accept();

	}

}
