package testngdemos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class twodimension {
  @Test(dataProvider= "dp")
  public static void DataInfo(Integer age,String name)
  {
	  System.out.println("age is"+" "+age);
	  System.out.println("name is"+" "+name);
  }
  @DataProvider
  public Object[][] dp() {
	  return new Object[][] {
		  new Object[] { 25,"ram"},
		  new Object[] { 32,"nandu"},
		  new Object[] { 16,"suma"},
			  };
		  }
}
