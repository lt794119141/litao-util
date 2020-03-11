package com.litao.common.utils;

import java.util.Date;

public class DateUtil {

	
	/*
	* 方法1：(10分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/

	@SuppressWarnings("deprecation")
	public static Date getDateByInitMonth(Date src){
		
		src.setDate(1);
		
		src.setHours(0);
		src.setMinutes(0);
		src.setSeconds(0);
		
		
		return src;
		
	}
	
	/*
	* 方法2：(10分)
	* 给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/

	@SuppressWarnings("deprecation")
	public static Date getDateByFullMonth(Date src){
		if(src.getMonth()==2) {
			if(src.getYear()%4 == 0 && src.getYear()%100!=0) {
				src.setDate(28);
			}else {
				src.setDate(29);
			}
		}else if(src.getMonth()==4||src.getMonth()==6||src.getMonth()==9||src.getMonth()==11){
			src.setDate(30);
		}else {
			src.setDate(31);
		}
		src.setHours(23);
		src.setMinutes(59);
		src.setSeconds(59);
		
		return src;
		
	}


	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println(getDateByFullMonth(new Date(2019, 5, 18, 11, 37,22)).toString());
	}
}
