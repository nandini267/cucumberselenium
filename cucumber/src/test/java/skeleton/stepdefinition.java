package skeleton;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepdefinition {
    Person sean=new Person();
	@Given("Sean is {int} meters away from Lucia")
	public void sean_is_meters_away_from_Lucia(Integer int1) {
	   sean.setDistance(int1);
	}

	@When("Sean shouts {string}")
	public void sean_shouts(String string) {
	   sean.setMessage(string); 
	}

	@Then("Lucia hears the message {string}")
	public void lucia_hears_the_message(String string) {
	    String Message=sean.getMessage();
	    Assert.assertEquals("Free Coffee", Message);
	}
	@Then("Lucia hears no message")
	public void lucia_hears_no_message() {
		String Message=sean.getMessage();
	    Assert.assertEquals(null, Message);
	}


} 
