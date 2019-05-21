package com.regex.core;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weruan
 * @date 2019-05-19
 */
public class Regex {

	private List<String> regex;

	private Regex(List<String> regex) {
		this.regex = regex;
	}

	public static RegexBuilder builder() {
		return new RegexBuilder();
	}

	public String toRegexString() {
		StringBuilder sb = new StringBuilder();
		sb.append("^");
		regex.forEach(sb::append);
		sb.append("$");
		return sb.toString();
	}

	public static class RegexBuilder {

		private List<String> list;

		public RegexBuilder() {
			list = new ArrayList<>();
		}

		public Regex build() {
			return new Regex(this.list);
		}

		public RegexBuilder or(String... string) {
			if (null == string) {
				throw new RuntimeException("args can not be null");
			}
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			sb.append(String.join("|", string));
			sb.append("]");
			list.add(sb.toString());
			return this;
		}

		public RegexBuilder add(String string) {
			list.add(string);
			return this;
		}

		/**
		 * can extract whose match the given string
		 */
		public RegexBuilder addExtract(String string) {
			list.add("(");
			list.add(string);
			list.add(")");
			return this;
		}

	}
}
