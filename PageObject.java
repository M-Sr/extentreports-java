package com.hilti.ta.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.hilti.ta.utils.WebDriverFactory;

public abstract class PageObject {

    protected boolean isElementVisible(final By locator) {
        try {
            final WebElement consentBanner = WebDriverFactory.getWebDriverWait(2).until(ExpectedConditions.presenceOfElementLocated(locator));
            return consentBanner.isDisplayed();
        } catch (final TimeoutException e) {
            // Element not found
            return false;
        }
    }


}
