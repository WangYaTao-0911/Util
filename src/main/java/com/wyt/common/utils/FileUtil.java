package com.wyt.common.utils;

import java.io.File;

public class FileUtil {

	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”
	*/
	public static String getExtendName(String fileName){
		//判断文件名是否为空或长度为0如果是0返回null
		if (null!=fileName && fileName.length()>0)
			//判断成功执行返回方法
			//通过字符串截取"."来获取文件名
			return fileName.substring(fileName.lastIndexOf("."));
		    return null;
		
	//TODO 实现代码
	}
	/*
	* 方法2：返回操作系统临时目录
	*/
	public static File getTempDirectory(){
	
		//获取指定的文件夹的方法
		String paht = System.getProperty("java.io.tmpdir");
		//返回执行文件目录
		return new File(paht);
	//TODO 实现代码
	}
	/*
	* 方法3：返回操作系统用户目录
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	public static File getUserDirectory(){
		String paht = System.getProperty("user.home");
		return new File(paht);
	//TODO 实现代码
	}

}
