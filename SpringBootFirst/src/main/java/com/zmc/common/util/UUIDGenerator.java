package com.zmc.common.util;

import java.util.UUID;

/**
 * Project Name: mpos
 * Package Name: cn.lifewallet.mpos.web.controller.member
 * Function: UUID批量产生器
 * user: San
 * Date:2017/7/14
 */
public class UUIDGenerator {
	public static String getUUID() {
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		return str;
	}
	
	public static String getUUIDSlip(){
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		// 去掉"-"符号
		String temp = str.substring(0,8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
		return temp;
	}
	
	//获得指定数量的UUID
	public static String[] getUUID(int number) {
		if (number < 1) {
		return null;
		}
		String[] ss = new String[number];
		for (int i = 0; i < number; i++) {
		ss[i] = getUUID();
		}
		return ss;
	}
}
