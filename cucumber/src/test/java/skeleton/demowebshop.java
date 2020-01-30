package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demowebshop {
	WebDriver driver;
	public demowebshop() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    PageFactory.initElements(driver, DemoWebShopLoginPage.class);
	}
	@Given("The URL of the Web Shop {string}")
	public void the_URL_of_the_Web_Shop(String url) {
		
	       driver.get(url); 
	}

	@When("User enters {string} as username")
	public void user_enters_as_username(String username) {
	   DemoWebShopLoginPage.email.sendKeys(username);
	}

	@When("User enters {string} as password")
	public void user_enters_as_password(String password) {
	    DemoWebShopLoginPage.password.sendKeys(password);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_Login_button() {
	    DemoWebShopLoginPage.login.click();
	}

	@Then("User is in valid page")
	public void user_is_in_valid_page() {
	    Assert.assertTrue(DemoWebShopLoginPage.logout.isDisplayed());
	   DemoWebShopLoginPage.logout.click();
	    }



}
