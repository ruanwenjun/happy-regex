package com.regex.model;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * @author weruan
 * @date 2019-05-19
 */
public class ConsistTest {

	@Test
	public void emailTest() {
		String email = Consist.EMAIL;
		boolean matches = "bestruanwenjun@gmail.com".matches(email);
		assertTrue(matches);
		boolean matches1 = ".bestruanwenjun@gmail.com".matches(email);
		assertFalse(matches1);
	}

	@Test
	public void domainTest(){
		String domain = Consist.DOMAIN;
		boolean matches = "bestruanwenjun.top".matches(domain);
		assertTrue(matches);
		boolean matches1 = "bestruanwenjun_.top".matches(domain);
		assertFalse(matches1);
	}

	@Test
	public void urlTest(){
		String url = Consist.URL;
		boolean matches = "https://github.com/".matches(url);
		assertTrue(matches);
		boolean matches1 = "asdada*https://github.com/".matches(url);
		assertFalse(matches1);
	}

	@Test
	public void phoneTest(){
		String phone = Consist.PHONE;
		boolean matches = "17345679011".matches(phone);
		assertTrue(matches);
		boolean matches1 = "16345679011".matches(phone);
		assertFalse(matches1);
	}
}
