package com.pyxissocial.automation.util;

import java.util.Random;

public class StringUtil {

	public static String getRandomString(int n) {
		String candidates = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
			// get random index
			Random random = new Random();
			int index = random.nextInt(candidates.length());

			// add character to builder
			builder.append(candidates.charAt(index));
		}

		return builder.toString();
	}
}
