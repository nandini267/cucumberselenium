package Casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class casestudy1 {
 WebDriver driver;
	@BeforeTest 
		public void openchrome()
		{
		String chromepath="C:\\Users\\Training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		 driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");

	     }
	@AfterTest
	 public void closechrome()
	 {
	
		//driver.close();
	 }
	
	@Test(priority=1)
	public void testRegistration() 
	{
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		driver.findElement(By.name("userName")).sendKeys("nandinibbbb");
		String avail=driver.findElement(By.tagName("h3")).getText();
		if(avail.equals("Avaliable"))
		{
		driver.findElement(By.name("firstName")).sendKeys("nandini");
		driver.findElement(By.name("lastName")).sendKeys("bethamcharla");
		driver.findElement(By.id("password")).sendKeys("nandu123");
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("nandu123");
		driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
		driver.findElement(By.id("emailAddress")).sendKeys("nandu123@mail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("8499940439");
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("07/04/1998");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//option[contains(text(),'What is your Nick Name?')]")).click();
		driver.findElement(By.xpath("//input[@id='answer']")).sendKeys("nandub");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		}
		
		
		
		
		
	}
	@Test(priority=2)
	public void testLogin() {
		//driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("nandinib");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bnandini69@");
		 driver.findElement(By.name("Login")).click();
		
	}
	@Test(priority=3)
	public void testCart()
	{
		//driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("bag");
		 driver.findElement(By.xpath("//form//input[@name='val']")).click();
		 driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).click();
		 driver.findElement(By.partialLinkText("Checko")).click();
	}
	@Test(priority=4)
	public void testPayment()
	{
		
		
		driver.findElement(By.xpath("//form[2]//input[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[contains(text(),'Icici Bank')]")).click();
		driver.findElement(By.xpath("//a[@id='btn']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nandinib");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Bnandini69@");
		driver.findElement(By.xpath("//div[3]//input[1]")).click();
	}
	

}
