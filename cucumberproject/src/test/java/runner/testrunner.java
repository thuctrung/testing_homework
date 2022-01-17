package runner;

import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import com.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/java/features"
        ,glue= "seleniumgluecode",
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
        monochrome = true
                )
public class testrunner {
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));
    }
}
