package com.hilti.ta.pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.hilti.ta.pages.PageObject;
import com.hilti.ta.utils.WebDriverFactory;

/**
 * Page Object Model header component that appears on all website's pages.
 */
public class HeaderComponent extends PageObject {

	private static final String CATEGORY_NAVIGATION_ITEM_PATTERN = "//li[@class='m-nav-secondary-stage-item is-active']//a[@class='js-navigation-link']/span[contains(text(), '%s')]";

	private final By productNavigationMenuItem = By.xpath("//div[@class='m-nav-primary-wrapper']//a[contains(@class, 'js-navigation-link-product')]");
	private final By productNavigation = By.xpath("//li[@class='m-nav-secondary-stage-item is-active']");


	public void expandProductNavigation() {
		WebDriverFactory.getDriver().findElement(productNavigationMenuItem).click();
	}

	public void verifyCategoryIsPresentInProductNavigation(final String categoryName) {
		final By categoryNavigationItem = By.xpath(String.format(CATEGORY_NAVIGATION_ITEM_PATTERN, categoryName));

		final WebElement webElement = WebDriverFactory.getDriver().findElement(categoryNavigationItem);

		Assert.assertNotNull(webElement, String.format("Web element not found for locator: %s", categoryNavigationItem));
		Assert.assertTrue(webElement.isDisplayed(), String.format("Web element not visible for locator: %s", categoryNavigationItem));
	}

	public void waitForProductNavigationToAppear() {
		WebDriverFactory.getWebDriverWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(productNavigation));
	}
}
