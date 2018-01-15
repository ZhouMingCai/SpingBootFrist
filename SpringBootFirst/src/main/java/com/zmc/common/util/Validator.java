package com.zmc.common.util;

import java.util.regex.Pattern;

/**
 * 校验器：利用正则表达式校验邮箱、手机号等
 * 
 * 
 * 
 */
public class Validator {
    /**
     * 正则表达式：验证用户名
     */
    public static final String REGEX_USERNAME = "^[a-zA-Z]\\w{5,17}$";
 
    /**
     * 正则表达式：验证密码
     */
    public static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,16}$";
 
    /**
     * 正则表达式：验证手机号
     */
    public static final String REGEX_MOBILE = "^((13[0-9])|(17[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$";
    
    /**
     * 正则表达式：验证电话号码
     */
    public static final String REGEX_TELEPHONE = "^[0]{1}[0-9]{2,3}-[0-9]{7,8}$";
 
    /**
     * 正则表达式：验证邮箱
     */
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
 
    /**
     * 正则表达式：验证汉字
     */
    public static final String REGEX_CHINESE = "^[\u4e00-\u9fa5],{0,}$";
    
    /**
     * 正则表达式：验证字母
     */
    public static final String REGEX_LETTER = "^[A-Za-z]+$";
 
    /**
     * 正则表达式：验证身份证
     */
    public static final String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";

    /**
     * 正则表达式：验证IP地址
     */
    public static final String REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
    
    /**
     * 正则表达式：验证两位小数
     */
    public static final String REGEX_DECIMAL = "^[0-9]+(.[0-9]{0,2})?$";
    
    /**
     * 正则表达式：验证数字
     */
    public static final String REGEX_NUMBER = "^[0-9]*$";
 
    /**
     * 校验用户名
     * 
     * @param username
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUsername(String username) {
        return Pattern.matches(REGEX_USERNAME, username);
    }
 
    /**
     * 校验密码
     * 
     * @param password
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isPassword(String password) {
        return Pattern.matches(REGEX_PASSWORD, password);
    }
 
    /**
     * 校验手机号
     * 
     * @param mobile
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isMobile(String mobile) {
        return Pattern.matches(REGEX_MOBILE, mobile);
    }
    
    /**
     * 校验电话号码
     * 
     * @param telephone
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isTelePhone(String telephone) {
        return Pattern.matches(REGEX_TELEPHONE, telephone);
    }

    /**
     * 校验手机号或电话号码
     * @param phoneNo
     * @return
     */
    public static boolean isTelePhoneOrMobile(String phoneNo) {
        return Pattern.matches(REGEX_TELEPHONE, phoneNo) || Pattern.matches(REGEX_MOBILE, phoneNo);
    }
    
    /**
     * 校验邮箱
     * 
     * @param email
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }
 
    /**
     * 校验汉字
     * 
     * @param chinese
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isChinese(String chinese) {
        return Pattern.matches(REGEX_CHINESE, chinese);
    }
    
    /**
	 * 验证验证输入字母
	 * 
	 * @param
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean IsLetter(String str) {
		return Pattern.matches(REGEX_LETTER, str);
	}
 
    /**
     * 校验身份证
     * 
     * @param idCard
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isIDCard(String idCard) {
        return Pattern.matches(REGEX_ID_CARD, idCard);
    }
 
    /**
     * 校验IP地址
     * 
     * @param ipAddr
     * @return
     */
    public static boolean isIPAddr(String ipAddr) {
        return Pattern.matches(REGEX_IP_ADDR, ipAddr);
    }
    
    /**
	 * 验证输入两位小数
	 * 
	 * @param
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean IsDecimal(String str) {
		return Pattern.matches(REGEX_DECIMAL, str);
	}
	
	/**
	 * 验证数字输入
	 * 
	 * @param
	 * @return 如果是符合格式的字符串,返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean IsNumber(String str) {
		return Pattern.matches(REGEX_NUMBER, str);
	}

	
	
	
	/*
    public static void main(String[] args) {
        //String username = "fdsdfsdj";
        System.out.println(Validator.isTelePhone("0571-84901565"));
    }*/
}