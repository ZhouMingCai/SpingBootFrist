package com.zmc.common.util;

/**
 * Project Name: mpos
 * Package Name: cn.lifewallet.mpos.web.controller.member
 * Function: sessionID 生成器
 * user: San
 * Date:2017/7/14
 */
public class SessionIDGenerator {


    /**
     * SessionID 生成
     * @param userName  用户名
     * @param password  密码
     * @param UUID  
     * @return
     * @throws Exception
     */
    public static String getSessionID(String userName,String password,String UUID) throws Exception{
       String sessionId = null;
       StringBuffer sb = new StringBuffer();
       sb.append(userName);
       sb.append(password);
       sb.append(UUID);
       sessionId = MD5Utils.md5(sb.toString());
       return sessionId;
    }
    
   /* public static void main(String[] args) throws Exception {
        String ss = SessionIDGenerator.getSessionID("18656081430", "e10adc3949ba59abbe56e057f20f883e", UUIDGenerator.getUUIDSlip());
        System.out.println(ss);
    }*/
}
