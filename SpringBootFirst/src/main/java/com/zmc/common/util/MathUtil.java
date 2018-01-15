package com.zmc.common.util;

import java.math.BigDecimal;

/**
 * Project Name: nphub-mng
 * Package Name: cn.lifewallet.nphubMng.common.util
 * Function: 数字计算
 * user: San
 * Date:2017/6/23
 */

public class MathUtil {

    /**
     * 四舍五入保留小数位
     * @param number 原始数值
     * @param point 保留小数位数
     * @return 结果;
     */
    public static BigDecimal computeRounding(BigDecimal number,int point){
        return  number.setScale(point, BigDecimal.ROUND_HALF_UP);
    }

    /*public static void main(String[] args){
        System.out.println(computeRounding(new BigDecimal("1.234"),2));
        System.out.println(computeRounding(new BigDecimal("1.235"),2));
        System.out.println(computeRounding(new BigDecimal("1.23"),3));
        System.out.println(computeRounding(new BigDecimal("1.2345"),3));
    }*/
}
