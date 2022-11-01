package runner;


import eu.tsystems.mms.tic.testframework.report.TesterraListener;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@Listeners(TesterraListener.class)
@CucumberOptions(
        strict = true,
        plugin = {"eu.tsystems.mms.tic.testerra.plugins.cucumber.TesterraReportPlugin"},
        features = "src/test/resources/features",
        glue = {"stepdefs", "eu.tsystems.mms.tic.testerra.plugins.cucumber"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

}