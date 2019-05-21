package com.regex.core;

import com.regex.model.RDate;
import com.regex.model.RNumber;
import com.regex.model.RString;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static junit.framework.Assert.*;

/**
 * @author weruan
 */
public class RegexTest {

	@Test
	public void orTest() {
		Regex regex = Regex.builder()
			.or(RNumber.anyLenNum(), RString.anyABC())
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
	public void addExtractTest() {
		Regex regex = Regex.builder()
			.add(RDate.yyyy_MM_dd)
			.add(" ")
			.addExtract(RString.anyLenString())
			.build();
		String format = "2019-05-21 16:17:18";
		Pattern pattern = Pattern.compile(regex.toRegexString());
		Matcher matcher = pattern.matcher(format);
		assertTrue(matcher.find());
		assertEquals("16:17:18", matcher.group(1));
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

	@Test
	public void testEx() {
		String s = "***github***.cn";
		Regex regex = Regex.builder()
			.add(RString.anyLenString())
			.add("github")
			.add(RString.anyLenString())
			.or(".cn", ".com")
			.build();
		boolean matches = s.matches(regex.toRegexString());
		assertTrue(matches);
	}
}
