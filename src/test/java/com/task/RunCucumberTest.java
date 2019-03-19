package com.task;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        format = {"pretty", "html:target/html"},
        features = {"classpath:features/enrolment/enrol_to_N11_via_facebook.feature"}
)
public class RunCucumberTest {

}