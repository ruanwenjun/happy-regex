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
		boolean matches = "中".matches(RString.anyChinese());
		assertTrue(matches);
		boolean matches1 = "c".matches(RString.anyChinese());
		assertFalse(matches1);
	}

	@Test
	public void anyAbcTest() {
		boolean matches = "A".matches(RString.anyABC());
		assertTrue(matches);
		boolean matches1 = "a".matches(RString.anyABC());
		assertFalse(matches1);
	}

	@Test
	public void anyabcTest() {
		boolean matches = "a".matches(RString.anyabc());
		assertTrue(matches);
		boolean matches1 = "B".matches(RString.anyabc());
		assertFalse(matches1);
	}

	@Test
	public void lenChineseTest() {
		boolean matches = "中国".matches(RString.lenChinese(1, 2));
		assertTrue(matches);
		boolean matches1 = "中国".matches(RString.lenChinese(3, 4));
		assertFalse(matches1);
	}

	@Test
	public void anyString() {
		boolean matches = " ".matches(RString.anyString());
		assertTrue(matches);
		boolean matches1 = "  ".matches(RString.anyString());
		assertFalse(matches1);
	}

	@Test
	public void anyLenString() {
		boolean matches = " 12*".matches(RString.anyLenString());
		assertTrue(matches);
	}

	@Test
	public void lenString() {
		boolean matches = "   ".matches(RString.lenString(3, 3));
		assertTrue(matches);
		boolean matches1 = "abc ".matches(RString.lenString(3, 3));
		assertFalse(matches1);
	}
}
