package com.hilti.ta.services;

import java.util.Date;

import org.openqa.selenium.Cookie;

import com.hilti.ta.utils.WebDriverFactory;

public class CookieService {

    /**
     * Creates cookie with specified name and value.
     *
     * @param name
     *            the name of created cookie
     * @param value
     *            the value of created cookie
     */
    public void createCookie(final String name, final String value) {
        final String path = "/";
        final Date expiry = null;
        final Cookie cookie = new Cookie(name, value, null, path, expiry);

        WebDriverFactory.getDriver().manage().addCookie(cookie);
    }
}
