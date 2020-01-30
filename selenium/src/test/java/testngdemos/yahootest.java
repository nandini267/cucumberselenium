package testngdemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class yahootest {
  @Test
  public void yahootest1() {
	  System.out.println("running yahootest");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method of yahoo");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method of yahoo");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class of yahoo");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class of yahoo");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test of yahoo");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test of yahooo");
  }
  

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite of yahoo");
}

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite of yahoo");
  }

}
