package runner;

//import cucumber.api.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import eu.tsystems.mms.tic.testframework.report.TesterraListener;
import org.testng.annotations.Listeners;

@Listeners(TesterraListener.class)
@CucumberOptions(
        strict = true,
        plugin = {"eu.tsystems.mms.tic.testerra.plugins.cucumber.TesterraReportPlugin"},
        features = "src/test/resources/features/search.feature",
        glue = {"stepdefs", "eu.tsystems.mms.tic.testerra.plugins.cucumber"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

}