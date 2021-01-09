package com.hilti.ta.services;

import com.hilti.ta.utils.WebDriverFactory;

public class BrowserService {

    public void refreshPage() {
        WebDriverFactory.getDriver().navigate().refresh();
    }
}
