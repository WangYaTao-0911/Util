package com.wyt.common.utils;



import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int i = RandomUtil.random(1,10);
		System.err.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] is=RandomUtil.subRandom(1,10,4);
		for (int i : is) {
			System.err.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.err.println(c);
	}

	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(4);
		System.err.println(string);
	}

}
