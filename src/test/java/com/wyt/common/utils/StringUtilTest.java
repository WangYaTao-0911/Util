package com.wyt.common.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void test1() {
		String src="123.34";
		boolean b = StringUtil.isNumber(src);
		System.out.println(b);
	}
	@Test
	public void testMobileAndEmail() {
		boolean b = StringUtil.isEmail("3488111qq.com");
		boolean c = StringUtil.isMobile("23799999999");
		System.out.println(b);
		System.out.println(c);
	}
	
	
	
	
	

	@Test
	public void testHasLength() {

		String str = " ";
		System.out.println(StringUtil.hasLength(str));

	}

	@Test
	public void testHasText() {

		String str = "abc";
		System.out.println(StringUtil.hasText(str));
	}

	@Test
	public void testRandomChinese() {
		String string = StringUtil.randomChineseString();
		System.out.println(string);
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(100);
		System.out.println(string);

	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);

		}

	}

	@Test
	public void testPerson() {
		for (int i = 0; i < 10000; i++) {
			// 姓名
			String name = StringUtil.generateChineseName();
			// 年龄
			int age = RandomUtil.random(1, 120);
			// 介绍
			String abount = StringUtil.randomChineseString(140);
			// 注册日期
			Calendar c = Calendar.getInstance();
			c.set(2010, 0, 1);

			Date created = DateUtil.getDate(c.getTime(), new Date());
			Person p = new Person(name, age, abount, created);
			System.out.println(p);
		}

	}
}
