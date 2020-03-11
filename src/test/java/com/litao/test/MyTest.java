package com.litao.test;

import java.util.Date;

import org.junit.Test;

import com.litao.common.utils.DateUtil;

public class MyTest {
	
	@Test
	public void test() {
		
		String sql = "select * from t_order where create_time>='"+DateUtil.getDateByInitMonth(new Date())+"' and create_time<='"+DateUtil.getDateByFullMonth(new Date())+"' ";
		System.out.println(sql);
	}
}
