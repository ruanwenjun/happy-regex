package com.regex.model;

/**
 * @author weruan
 * @date 2019-05-19
 */
public class RNumber {

	/**
	 * match 0 - 9
	 */
	private final static String ANY_NUM = "[0-9]";

	/**
	 * match any number
	 */
	private final static String ANY_LUN_NUM = "[0-9]*";

	/**
	 * match given len number
	 */
	private final static String LEN_NUM = "\\d{%s}";

	/**
	 * match num len more then s
	 */
	private final static String MORE_LEN_NUM = "\\d{%s,}";

	/**
	 * match num len between s1,s2
	 */
	private final static String M_N_NUM = "\\d{%s,%s}";

	public static String anyNum() {
		return RNumber.ANY_NUM;
	}

	public static String anyLenNum() {
		return RNumber.ANY_LUN_NUM;
	}

	public static String lenNum(int n) {
		return String.format(RNumber.LEN_NUM, n);
	}

	public static String lenNum(int m, int n) {
		return String.format(RNumber.M_N_NUM, m, n);
	}

	public static String moreLenNum(int n) {
		return String.format(RNumber.MORE_LEN_NUM,n);
	}


}
