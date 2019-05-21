package com.regex.model;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * @author weruan
 * @date 2019-05-19
 */
public class RNumberTest {

	@Test
	public void anyNumberTest() {
		String anyNum = RNumber.anyNum();
		boolean matches = "1".matches(anyNum);
		assertTrue(matches);
		boolean matches1 = "a".matches(anyNum);
		assertFalse(matches1);
	}

	@Test
	public void lenNumberTest() {
		boolean matches = "1234".matches(RNumber.lenNum(4));
		assertTrue(matches);
		boolean matches1 = "1234".matches(RNumber.lenNum(3));
		assertFalse(matches1);
	}

	@Test
	public void moreLenNumberTest() {
		boolean matches = "1234".matches(RNumber.moreLenNum(4));
		assertTrue(matches);
		boolean matches1 = "1234".matches(RNumber.moreLenNum(5));
		assertFalse(matches1);
	}
}
