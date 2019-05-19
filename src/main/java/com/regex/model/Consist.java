package com.regex.model;

/**
 * @author weruan
 * @date 2019-05-19
 */
public class Consist {

	public final static String EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

	public final static String URL = "[a-zA-z]+://[^\\s]*";

	public final static String DOMAIN = "[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(\\.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+\\.?";

	public final static String PHONE = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9]|17[3])\\d{8}$";



}
