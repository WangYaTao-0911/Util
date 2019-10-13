package com.wyt.common.utils;



import java.io.File;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String fileName=".m2.doc";
		String name = FileUtil.getExtendName(fileName);
		System.err.println(name);
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.err.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getTempDirectory();
		System.err.println(file);
	}

}
