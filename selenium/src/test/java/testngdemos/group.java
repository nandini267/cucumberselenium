package testngdemos;

import org.testng.annotations.Test;

public class group {
  @Test(groups= {"Car"})
  public void CarTest() {
	  System.out.println("Batch car- Test CarTest");
  }
  @Test(groups= {"Scooter"})
  
	  public void scooter2() {
  System.out.println("Batch scooter- Test scooter 2");
	  }
  @Test(groups= {"Car","Sedan Car"})
  public void Sedan1() {
	  System.out.println("Batch sedan car-Test sedan1");
  }
  
  
  
	  
}
