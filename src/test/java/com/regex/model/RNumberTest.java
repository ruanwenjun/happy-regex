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
		String anyNum = RNumber.ANY_NUM;
		boolean matches = "1".matches(anyNum);
		assertTrue(matches);
		boolean matches1 = "a".matches(anyNum);
		assertFalse(matches1);
	}

	@Test
	public void lenNumberTest() {
		String nNum = RNumber.LEN_NUM;
		boolean matches = "1234".matches(String.format(nNum, 4));
		assertTrue(matches);
		boolean matches1 = "1234".matches(String.format(nNum, 3));
		assertFalse(matches1);
	}

	@Test
	public void moreLenNumberTest() {
		String moreNNumber = RNumber.MORE_LEN_NUM;
		boolean matches = "1234".matches(String.format(moreNNumber, 4));
		assertTrue(matches);
		boolean matches1 = "1234".matches(String.format(moreNNumber, 5));
		assertFalse(matches1);
	}
}
