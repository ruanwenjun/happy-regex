package com.regex.core;

import com.regex.model.RNumber;
import com.regex.model.RString;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * @author weruan
 * @date 2019-05-19
 */
public class RegexTest {

	@Test
	public void orTest() {
		Regex regex = Regex.builder()
			.or(RNumber.ANY_NUM, RString.ANY_ABC)
			.build();
		String regexString = regex.toRegexString();
		boolean matches = "A".matches(regexString);
		assertTrue(matches);
		boolean matches1 = "1".matches(regexString);
		assertTrue(matches1);
		boolean matches2 = "b".matches(regexString);
		assertFalse(matches2);
		boolean matches3 = "1A".matches(regexString);
		assertFalse(matches3);
	}

	@Test
	public void test() {
		Regex regex = Regex.builder()
			.add(RNumber.lenNum(3))
			.add(".")
			.add(RNumber.lenNum(3))
			.add(".")
			.add(RNumber.lenNum(3))
			.add(".")
			.add(RNumber.lenNum(3))
			.build();
		String regexString = regex.toRegexString();
		boolean matches = "112.169.192.192".matches(regexString);
		assertTrue(matches);
	}
}
