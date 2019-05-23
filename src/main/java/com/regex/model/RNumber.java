package com.regex.model;

import com.regex.exception.ArgsErrorException;

/**
 * @author weruan
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

	/**
	 * match any Num
	 *
	 * @return
	 */
	public static String anyNum() {
		return RNumber.ANY_NUM;
	}

	/**
	 * match any len num
	 * @return
	 */
	public static String anyLenNum() {
		return RNumber.ANY_LUN_NUM;
	}

	/**
	 * match given len num
	 * @param n num len should be n
	 * @return
	 */
	public static String lenNum(int n) {
		if (n <= 0) {
			throw new ArgsErrorException();
		}
		return String.format(RNumber.LEN_NUM, n);
	}

	/**
	 * match given len num
	 * @param m
	 * @param n
	 * @return
	 */
	public static String lenNum(int m, int n) {
		if (m <= 0 || m > n) {
			throw new ArgsErrorException();
		}
		return String.format(RNumber.M_N_NUM, m, n);
	}

	/**
	 * match given len num
	 * @param n
	 * @return
	 */
	public static String moreLenNum(int n) {
		if (n <= 0) {
			throw new ArgsErrorException();
		}
		return String.format(RNumber.MORE_LEN_NUM,n);
	}


}
