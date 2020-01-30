package skeleton;

import io.cucumber.java.en.Given;

public class cucumberexpsn {
	@Given("(Sarah|She) has {double} cucumber(s) in {word} {word}")
	public void sarah_has_cucumbers_in_her_bag(Double double1,String str1,String str2) {
	   System.out.println(double1 +str1 +str2);
	}
}
