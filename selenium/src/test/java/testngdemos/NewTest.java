package testngdemos;

import org.testng.annotations.Test;

public class NewTest {
  @Test(dataProvider="dp", dataProviderClass=twodimension.class)
  public void client1test(Integer p,String p1) 
  {
	  System.out.println("client1 testing: Data(" + p +" , "+"String is "+ " - "+p1+")");
  }
  @Test(dataProvider="dp", dataProviderClass=twodimension.class)
  public void client2test(Integer x,String y)
  {
	  System.out.println("client2 testing: Data(" + x + " , " +"String is "+ "-"+y+")");
  }
  
}
