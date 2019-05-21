package com.regex.model;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * @author weruan
 * @date 2019-05-19
 */
public class RDateTest {

	@Test
	public void yyyyMmDdTest() {
		String yyyy_mm_dd = RDate.yyyy_MM_dd;
		boolean matches = "2019-12-19".matches(yyyy_mm_dd);
		assertTrue(matches);
		boolean matches1 = "2019-05-19".matches(yyyy_mm_dd);
		assertTrue(matches1);
		boolean matches2 = "2019-05-198".matches(yyyy_mm_dd);
		assertFalse(matches2);
		boolean matches3 = "2019-13-01".matches(RDate.yyyy_MM_dd);
		assertFalse(matches3);
	}
}
