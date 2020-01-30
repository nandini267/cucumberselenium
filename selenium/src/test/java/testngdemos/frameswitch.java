package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frameswitch {

	public static void main(String[] args) {
		String chromepath="C:\\Users\\Training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains("Demo Guru99 Page"));
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("html/body/a/img")).click();
		
		
		

	}

}
