package testbatch;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="demo30cucu.feature",glue= {"jan31cucu"}, tags= {"@SmokeTest"},plugin="json:target/cucumber-report.json")

public class TestRun {

}
