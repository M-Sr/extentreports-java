package com.hilti.ta.pages.components;

import org.openqa.selenium.By;

import com.hilti.ta.pages.PageObject;
import com.hilti.ta.utils.WebDriverFactory;

/**
 * Page Object Model representing Legal Consents Banner and Popup.
 */
public class ConsentsComponent extends PageObject {

    private final By consentBanner = By.xpath("//div[contains(@id,'didomi')][1]//div[contains(@class,'notice__')]");
    private final By acceptCookieSettingsButton = By.xpath("//div[@id='didomi-custom-host']//a[contains(@class, 'a-button-primary accept_button')]");
    private final By cookieSettings = By.xpath("//div[contains(@id,'didomi')][1]//div[contains(@id,'didomi')]");
    private final By denyButton = By.xpath("(//div[contains(@id,'didomi')][1]//div[contains(@class,'bottom_')]//a)[last()-1]");

    /**
     * Closes consents banner or popup.
     */
    public void closeConsents() {
        if (isConsentsBannerVisible()) {
            clickAcceptCookieSettingsButton();
        } else if (areCookieSettingsVisible()) {
            clickDenyButton();
        }
    }

    private boolean isConsentsBannerVisible() {
        return isElementVisible(consentBanner);
    }

    public void clickAcceptCookieSettingsButton() {
        WebDriverFactory.getDriver().findElement(acceptCookieSettingsButton).click();
    }

    public boolean areCookieSettingsVisible() {
        return isElementVisible(cookieSettings);
    }

    public void clickDenyButton() {
        WebDriverFactory.getDriver().findElement(denyButton).click();
    }
}
