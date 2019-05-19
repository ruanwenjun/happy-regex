package com.regex.model;

/**
 * @author weruan
 * @date 2019-05-19
 */
public class RString {

	public final static String ANY_CHINESE = "[\\u4e00-\\u9fa5]";

	public final static String LEN_CHINESE = "[\\u4e00-\\u9fa5]{%s,%s}";

	public final static String ANY_LEN_CHINESE = "[\\u4e00-\\u9fa5]*";

	public final static String ANY_ABC = "[A-Z]";

	public final static String LEN_ABC = "[A-Z]{%s,%s}";

	public final static String ANY_LEN_ABC = "[A-Z]*";

	public final static String ANY_abc = "[a-z]";

	public final static String LEN_abc = "[a-z]{%s,%s}";

	public final static String ANY_LEN_abc = "[a-z]*";

	public final static String ANY_STRING = ".";

	public final static String LEN_STRING = ".{%s,%s}";

	public final static String ANY_LEN_STRING = ".*";


}
