package Runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features ="src/main/java/Features", glue ="stepDefinitions", tags="Google1",dryRun = true, 
plugin="json:target/cucumberReports/cucumberTestReport.json")
public class TestRunner {
	
	TestNGCucumberRunner runner;
	
	@BeforeClass(alwaysRun = true)
	public void setup() {
		runner = new TestNGCucumberRunner(this.getClass());
	}
	@Test(groups="cucumber", description="Run cucumber with TestNG", dataProvider = "features")
	public void testGoogle(CucumberFeatureWrapper feature) {
		runner.runCucumber(feature.getCucumberFeature());
	}
	@DataProvider
	public Object[][] features(){
		return runner.provideFeatures();
	}
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		runner.finish();
	}

	
}
