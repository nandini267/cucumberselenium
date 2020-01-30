package testngdemos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {
	public void validate_Sign_On() 
	  {
		  System.out.println("Validating sign_on");
	  }
	  @Test(priority=15,enabled=false)
	  public void validate_Register()
	  {
		  System.out.println("Validating Register");
	  }
	  @Test(priority=3)
	  public void validate_Support()
	  {
		  System.out.println("Validating support");
	  }
	  @Test(priority=19)
	  public void Validate_Contact() {
		  System.out.println("validating contact");
	  }
	  
	  @BeforeClass
	  public void open_browser()
	  {
		  System.out.println("opening browser");
	  }
	  @AfterClass
	  public void close_browser()
	  {
		  System.out.println("Closing browser");
	  }
	  
	  @BeforeMethod
	  public void Home_Page()
	  {
		  System.out.println("Opening home page");
	  }
	  @AfterMethod
	  public void Sign_out()
	  {
		  System.out.println("Signing out");
	  }
	}
}
