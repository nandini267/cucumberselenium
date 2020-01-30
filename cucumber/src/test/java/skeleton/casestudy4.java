package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy4 {
	WebDriver driver;
	@Given("Alex has registered on testmeapp {string}")
	public void alex_has_registered_on_testmeapp(String url) {
	   
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("nandinibb");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bnandini69@");
	    driver.findElement(By.name("Login")).click();
	    

	}

	@When("Alex search for a particular product like headphones")
	public void alex_search_for_a_particular_product_like_headphones() {
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("head");
		driver.findElement(By.xpath("//form//input[@name='val']")).click();
	}

	@When("try to proceed for payment without any item in cart")
	public void try_to_proceed_for_payment_without_any_item_in_cart() {
	   driver.findElement(By.xpath("//form[2]//input[1] ")).isDisplayed();
	  Assert.assertFalse(driver.findElement(By.xpath("//form[2]//input[1] ")).isDisplayed());
	}

	@Then("Testmeapp doesnt display the cart icon")
	public void testmeapp_doesnt_display_the_cart_icon() {
		driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).isDisplayed();
		Assert.assertFalse(driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).isDisplayed());
	}



}
