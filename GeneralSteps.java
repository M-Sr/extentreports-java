package com.hilti.ta.steps;

import com.hilti.ta.pages.Homepage;
import com.hilti.ta.pages.components.ConsentsComponent;
import com.hilti.ta.services.BannersService;
import com.hilti.ta.services.BrowserService;
import com.hilti.ta.services.CookieService;
import com.hilti.ta.utils.Country;

import io.cucumber.java.en.Given;

import java.util.List;

/**
 * Cucumber steps definition class for general purpose steps.
 */
public class GeneralSteps {

	private final Homepage homepage = new Homepage();
	private final ConsentsComponent consentsComponent = new ConsentsComponent();
	private final BannersService bannersService = new BannersService();
	private final CookieService cookieService = new CookieService();
	private final BrowserService browserService = new BrowserService();

	@Given("User opens Hilti website for country {}")
	public void userOpensHiltiWebsite(final Country country) {
		homepage.navigateTo(country);

		consentsComponent.closeConsents();
		String bannerIds = String.join("*",bannersService.getBannerIdsForCountry(country));

		if (bannerIds.length() > 4096) {
			bannerIds = bannerIds.substring(0, 4096);
		}
		cookieService.createCookie("bannedBannersPermanently", bannerIds);

		browserService.refreshPage();
	}
}
