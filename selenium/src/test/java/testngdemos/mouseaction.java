package testngdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction {

	public static void main(String[] args) {
		String chromepath="C:\\Users\\Training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@href='/electronics']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//a[@href='/camera-photo']"))).click().build().perform();
		

	}

}
