package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class drivermethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromepath="C:\\Users\\Training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://selenium.dev/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.NANOSECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Downloads")).click();
		driver.navigate().back();
	
		driver.navigate().forward();
		driver.navigate().to("http://google.com");
		driver.navigate().refresh();
		String text=driver.getTitle();
		System.out.println(text);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getPageSource());
		

	}

}
