package com.wyt.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
	/*
	* 方法1：批量关闭流，参数能传无限个
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	public static void closeAll(AutoCloseable ...autoCloseables ){
		  //判断可变参数是否有值.
		   if (null!=autoCloseables && autoCloseables.length>0) {
			for (AutoCloseable autoCloseable2 : autoCloseables) {
				try {
					autoCloseable2.close();
				} catch (Exception e) {
					// TODO: handle excepti
					e.printStackTrace();
				}
			}
		}
	//TODO 实现代码
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	*/
	public static String readTextFile(InputStream src){
		String str="";
		byte[] b=new byte[1024];
		int x=0;
		try {
			while((x=src.read(b))!=-1){
				str += new String(b,0,x,"utf-8");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			closeAll(src);//关流
		}
		return str;
	//TODO 实现代码
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile){
		
		try {
			return readTextFile(new FileInputStream(txtFile));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	//TODO 实现代码
	}
	/**
	 * 方法4 一行行的读取文件内容
	 * 
	 */
	
	public static List<String> readLine(InputStream in){
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(in));
		List<String> list=new ArrayList<String>();
		String str="";
		try {
			while((str=bf.readLine())!=null) {
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
		

	} 
}
