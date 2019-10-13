package com.wyt.common.utils;



import java.io.File;
import java.io.FileInputStream;


import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
		
	}

	@Test
	public void testReadTextFileInputStream() throws Exception {
		//获取输入流
		
		String string = StreamUtil.readTextFile(new FileInputStream(new File("E:/Spring学习.docx")));
		System.err.println(string);
	}

	@Test
	public void testReadTextFileFile() {
		String string = StreamUtil.readTextFile(new File("c:kms8.log"));
		System.err.println(string);
	}

}
