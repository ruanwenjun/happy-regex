package com.regex.model;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * @author weruan
 * @date 2019-05-19
 */
public class RStringTest {

	@Test
	public void anyChineseTest() {
		String anyChinese = RString.ANY_CHINESE;
		boolean matches = "中国".matches(anyChinese);
		assertTrue(matches);
		boolean matches1 = "chinese".matches(anyChinese);
		assertFalse(matches1);
	}

	@Test
	public void anyAbcTest() {
		String anyAbc = RString.ANY_ABC;
		boolean matches = "AB".matches(anyAbc);
		assertTrue(matches);
		boolean matches1 = "ab".matches(anyAbc);
		assertFalse(matches1);
	}

	@Test
	public void anyabcTest() {
		String anyAbc = RString.ANY_abc;
		boolean matches = "ab".matches(anyAbc);
		assertTrue(matches);
		boolean matches1 = "aB".matches(anyAbc);
		assertFalse(matches1);
	}

	@Test
	public void lenChineseTest() {
		String lenChinese = RString.LEN_CHINESE;
		boolean matches = "中国".matches(String.format(lenChinese, 1, 2));
		assertTrue(matches);
		boolean matches1 = "中国".matches(String.format(lenChinese, 3, 4));
		assertFalse(matches1);
	}

	@Test
	public void anyString() {
		String anyString = RString.ANY_STRING;
		boolean matches = " ".matches(anyString);
		assertTrue(matches);
		boolean matches1 = "  ".matches(anyString);
		assertFalse(matches1);
	}

	@Test
	public void anyLenString() {
		String anyLenString = RString.ANY_LEN_STRING;
		boolean matches = " 12*".matches(anyLenString);
		assertTrue(matches);
	}

	@Test
	public void lenString() {
		String lenString = RString.LEN_STRING;
		boolean matches = "   ".matches(String.format(lenString, 3, 3));
		assertTrue(matches);
		boolean matches1 = "abc ".matches(String.format(lenString, 3, 3));
		assertFalse(matches1);
	}
}
