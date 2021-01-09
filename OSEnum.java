package com.hilti.ta.utils;

/**
 * Enumeration class for indication of the current operating system.
 */
public enum OSEnum {
	MACOS, WINDOWS;

	public static OSEnum getOS() {
		final String name = System.getProperty("os.name");
		if (name.contains("Mac")) {
			return MACOS;
		} else if (name.contains("Win")) {
			return WINDOWS;
		} else {
			throw new RuntimeException(String.format("Unsupported operation system %s", name));
		}
	}
}
