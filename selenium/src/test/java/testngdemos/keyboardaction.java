package testngdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class keyboardaction {

	public static void main(String[] args) {
		String chromepath="C:\\Users\\Training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Search=driver.findElement(By.cssSelector("input[value='Search store']"));
		Actions action=new Actions(driver);
		action.keyDown(Search,Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).perform();
		action.keyDown(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click().build().perform();
		Assert.assertTrue(driver.getTitle().contains("Build your own cmputer"));

	}

}
