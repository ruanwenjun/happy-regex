package com.regex.model;

/**
 * @author weruan
 */
public class RString {

	private final static String ANY_CHINESE = "[\\u4e00-\\u9fa5]";

	private final static String LEN_CHINESE = "[\\u4e00-\\u9fa5]{%s,%s}";

	private final static String ANY_LEN_CHINESE = "[\\u4e00-\\u9fa5]*";

	private final static String ANY_ABC = "[A-Z]";

	private final static String LEN_ABC = "[A-Z]{%s,%s}";

	private final static String ANY_LEN_ABC = "[A-Z]*";

	private final static String ANY_abc = "[a-z]";

	private final static String LEN_abc = "[a-z]{%s,%s}";

	private final static String ANY_LEN_abc = "[a-z]*";

	private final static String ANY_STRING = ".";

	private final static String LEN_STRING = ".{%s,%s}";

	private final static String ANY_LEN_STRING = ".*";

	/**
	 * match any Chinese
	 */
	public static String anyChinese() {
		return RString.ANY_CHINESE;
	}

	/**
	 * match Chinese len between m, n
	 */
	public static String lenChinese(int m, int n) {
		return String.format(RString.LEN_CHINESE, m, n);
	}

	/**
	 * match any len chinese
	 */
	public static String anyLenChinese() {
		return RString.ANY_LEN_CHINESE;
	}

	/**
	 * match A-Z
	 */
	public static String anyABC() {
		return RString.ANY_ABC;
	}

	/**
	 * match A-Z , len between m, n
	 */
	public static String lenABC(int m, int n) {
		return String.format(RString.LEN_ABC, m, n);
	}

	/**
	 * match any len A-Z
	 */
	public static String anyLenABC() {
		return RString.ANY_LEN_ABC;
	}

	public static String anyabc() {
		return RString.ANY_abc;
	}

	public static String lenabc(int m, int n) {
		return String.format(RString.LEN_abc, m, n);
	}

	public static String anyLenabc() {
		return RString.ANY_LEN_abc;
	}

	public static String anyString() {
		return RString.ANY_STRING;
	}

	public static String lenString(int m, int n) {
		return String.format(RString.LEN_STRING, m, n);
	}

	public static String anyLenString() {
		return RString.ANY_LEN_STRING;
	}

}
