package com.regex.model;

/**
 * @author weruan
 * @date 2019-05-19
 */
public class RNumber {

	public final static String ANY_NUM = "[0-9]";

	public final static String ANY_LUN_NUM = "[0-9]*";

	public final static String LEN_NUM = "\\d{%s}";

	public final static String MORE_LEN_NUM = "\\d{%s,}";

	public final static String M_N_NUM = "\\d{%s,%s}";

	public final static String ZERO_BEGIN = "(0[0-9]*)";

	public final static String NOT_ZERO_BEGIN = "[1-9][0-9]*";

	public final static String M_N_BEGIN = "[%s-%s][0-9]*";

	public static String lenNum(int n) {
		return String.format(RNumber.LEN_NUM, n);
	}
}
