package skeleton;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(plugin= {"pretty","html:cucmber-reports"},features= {"src/test/resources/demowebshop.feature"},monochrome=true
	,dryRun=false)
	public class cucumberRunner {
}
