package com.hilti.ta.steps;

import com.hilti.ta.pages.components.HeaderComponent;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Cucumber steps definition class related to Product Navigation functionality.
 */
public class ProductNavigationSteps {

	private final HeaderComponent headerComponent = new HeaderComponent();

	@When("User expands products navigation")
	public void expandProductNavigation() {
		headerComponent.expandProductNavigation();
		headerComponent.waitForProductNavigationToAppear();
	}

	@Then("User verifies category {} is present on the products navigation")
	public void verifyTheCategoryIsPresentInProductsNavigation(final String categoryName) {
		headerComponent.verifyCategoryIsPresentInProductNavigation(categoryName);
	}

}
