package com.hilti.ta.utils;

import java.util.Locale;

/**
 * Enumeration class containing part of countries supported by HILTI website.
 */
public enum Country {
	US("United States", ".com", Locale.US),
	DE("Germany", ".de", Locale.GERMANY),
	RU("Russia", ".ru", new Locale("ru", "RU")),
	JP("Japan", ".co.jp", Locale.JAPAN),
	CN("China", ".cn", Locale.SIMPLIFIED_CHINESE);

	private String name;
	private String domain;
	private Locale defaultLocale;

	Country(final String name, final String domain, final Locale defaultLocale) {
		this.name = name;
		this.domain = domain;
		this.defaultLocale = defaultLocale;
	}

	public String getName() {
		return name;
	}

	public String getDomain() {
		return domain;
	}

	public Locale getDefaultLocale() {
		return defaultLocale;
	}
}
