package testngdemos;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
  @Test
  public void softassertex() {
	  SoftAssert sa=new SoftAssert();
	  
	  System.out.println("test case two started");
	  sa.assertEquals("hello","Hello","first assert failed");
	  System.out.println("hard assert success");
	  sa.assertTrue("hello".equals("hello"),"Second soft assert failed");
	  sa.assertTrue("Welcome".equals("welcome"),"third soft assert failed");
	  
	  System.out.println("test case two executed successfully");
	  sa.assertAll();
  }
}
