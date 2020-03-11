package com.litao.common.utils;

public class FileUtil {

	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
	*/

	public static String getExtendName(String fileName){
		int i = fileName.lastIndexOf(".");
		String substring = fileName.substring(i);
		return substring;
	}

	public static void main(String[] args) {
		System.out.println(getExtendName("aaa.png"));
	}
}
