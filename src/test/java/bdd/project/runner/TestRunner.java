package bdd.project.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "bdd.project.steps",
        tags = "@Smoke",
        dryRun =false,
        plugin = {
           "html:target/html_report/report.html"
        }
)
public class TestRunner {

}
