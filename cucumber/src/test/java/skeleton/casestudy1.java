package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy1 {
	/*WebDriver driver;
	@Given("The url of testmeapp {string}")
	public void the_url_of_testmeapp(String url) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("User enters {string} as userName")
	public void user_enters_as_userName(String userName) {
	    driver.findElement(By.name("userName")).sendKeys("nandinibb");
	}

	@When("User enters {string} as firstname")
	public void user_enters_as_firstname(String firstName) {
		driver.findElement(By.name("firstName")).sendKeys("firstName");
	}

	@When("User enters {string} as lastname")
	public void user_enters_as_lastname(String lastname) {
		driver.findElement(By.name("lastName")).sendKeys("bethamcharla");
	}

	@When("User enters {string} as Password")
	public void user_enters_as_Password(String Password) {
		driver.findElement(By.name("password")).sendKeys("Bnandini69@");
	}

	@When("User enters {string} as confirmpassword")
	public void user_enters_as_confirmpassword(String confirmpassword) {
		driver.findElement(By.name("confirmPassword")).sendKeys("Bnandini69@");
	}

	@When("User selects {string} as gender")
	public void user_selects_as_gender(String gender) {
		driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();
	}

	@When("User enters {string} as email")
	public void user_enters_as_email(String email) {
		driver.findElement(By.name("emailAddress")).sendKeys("nandu@gmail.com");
	}

	@When("User enters {string} as mobilenumber")
	public void user_enters_as_mobileumber(String number) {
		driver.findElement(By.name("mobileNumber")).sendKeys("9726589453");
	}

	@When("User enters {string} as dob")
	public void user_enters_as_dob(String string) {
		driver.findElement(By.name("dob")).sendKeys("07/04/1998");
	}

	@When("User enters {string} as address")
	public void user_enters_as_address(String string) {
		driver.findElement(By.name("address")).sendKeys("hyderabad");
	}

	@When("User selects {string} as securityquestion")
	public void user_selects_as_securityquestion(String string) {
		driver.findElement(By.xpath("//option[contains(text(),'What is your Nick Name?')]")).click();
	}

	@When("User writes {string} as answer")
	public void user_writes_as_answer(String string) {
		driver.findElement(By.name("answer")).sendKeys("nandu");
	}

	@Then("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}



}
