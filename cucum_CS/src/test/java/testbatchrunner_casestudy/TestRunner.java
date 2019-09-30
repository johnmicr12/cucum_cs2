package testbatchrunner_casestudy;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features_casestudy",glue="stepdef_casestudy",plugin= {"json:target/cucum_CS-json-report.json"})
public class TestRunner {

}