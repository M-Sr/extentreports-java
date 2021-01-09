package com.hilti.ta.steps;

import com.hilti.ta.utils.WebDriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * Cucumber hook steps definition class responsible for actions taken before and after test execution.
 */
public class BackgroundSteps {

	@Before
	public void beforeUITests() {
		WebDriverFactory.initialize();
	}

	@After
	public void afterUITests(final Scenario scenario) {
		if (!scenario.isFailed()) {
			WebDriverFactory.quitCurrentDriver();
		}
	}
}
