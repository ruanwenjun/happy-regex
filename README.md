[![Build Status](https://travis-ci.org/ruanwenjun/happy-regex.svg?branch=master)](https://travis-ci.org/ruanwenjun/happy-regex)
# happy-regex

happy-regex is simple API that allows you to easily generate regex by using simple Java code.

With happy-regex, you don't need to query regex expression rules to generate usable regex expressions.

And happy-regex pre supply some common regex.

# How to use

happy-regex use simple Java api to build a regex , in the future will support to used by maven or gradle

add maven dependency
```
<dependency>
  <groupId>com.github.ruanwenjun</groupId>
  <artifactId>happy-regex</artifactId>
  <version>1.0.1</version>
</dependency>
```

example 1:
```
Regex regex = Regex.builder()
    .add(RNumber.lenNum(3))
    .add(".")
    .add(RNumber.lenNum(3))
    .add(".")
    .add(RNumber.lenNum(3))
    .add(".")
    .add(RNumber.lenNum(3))
    .build();
String regexString = regex.toRegexString();
boolean matches = "112.169.192.192".matches(regexString);
assertTrue(matches);
```
example 2:
```
Regex regex = Regex.builder()
    .add(RDate.yyyy_MM_dd)
    .add(" ")
    .addExtract(RString.anyLenString())
    .build();
String format = "2019-05-21 16:17:18";
Pattern pattern = Pattern.compile(regex.toRegexString());
Matcher matcher = pattern.matcher(format);
assertTrue(matcher.find());
assertEquals("16:17:18", matcher.group(1));
```

# Contributing

Thank you for your interest in contributing! Please add pull request with some test.
