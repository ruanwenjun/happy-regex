package com.regex.model;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * @author weruan
 * @date 2019-05-19
 */
public class CommonTest {

	@Test
	public void emailTest() {
		String email = Common.EMAIL;
		boolean matches = "bestruanwenjun@gmail.com".matches(email);
		assertTrue(matches);
		boolean matches1 = ".bestruanwenjun@gmail.com".matches(email);
		assertFalse(matches1);
	}

	@Test
	public void domainTest(){
		String domain = Common.DOMAIN;
		boolean matches = "bestruanwenjun.top".matches(domain);
		assertTrue(matches);
		boolean matches1 = "bestruanwenjun_.top".matches(domain);
		assertFalse(matches1);
	}

	@Test
	public void urlTest(){
		String url = Common.URL;
		boolean matches = "https://github.com/".matches(url);
		assertTrue(matches);
		boolean matches1 = "asdada*https://github.com/".matches(url);
		assertFalse(matches1);
	}

	@Test
	public void phoneTest(){
		String phone = Common.PHONE;
		boolean matches = "17345679011".matches(phone);
		assertTrue(matches);
		boolean matches1 = "16345679011".matches(phone);
		assertFalse(matches1);
	}
}
