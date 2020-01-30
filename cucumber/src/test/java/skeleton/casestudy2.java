package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy2 {
/*	WebDriver driver;
	@Given("The url of testmeapp {string}")
	public void the_url_of_testmeapp(String url) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
	    driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	}

	@When("User enters {string} as UserName")
	public void user_enters_as_UserName(String UserName) {
	    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(UserName);
	}

	@When("User enters {string} as PassWord")
	public void user_enters_as_PassWord(String Password) {
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	}

	@Then("User clicks on the {string} button")
	public void user_clicks_on_the_button(String lOGIN) {
	    driver.findElement(By.name("Login")).click();
	}
@When("User searches for a product")
public void user_searches_for_a_product() {
    driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("head");
}

@When("User clicks on find details")
public void user_clicks_on_find_details() {
   driver.findElement(By.xpath("//form//input[@name='val']")).click();
}

@Then("User clicks on addtocart")
public void user_clicks_on_addtocart() {
    driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
}



}
