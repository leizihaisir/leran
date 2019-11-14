package com.ileir.demo.StringTest;

import java.math.BigDecimal;

/**
 * @author: zihailei
 * @description:
 * @date: 2019/9/27 17:21
 **/
public class Test {

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("10.5000");
        BigDecimal bigDecimal1 = new BigDecimal("2.3000");
        BigDecimal technologyRate = bigDecimal.divide(bigDecimal1, 4, BigDecimal.ROUND_HALF_UP);
        System.out.println(technologyRate.toString());
        System.out.println(technologyRate.doubleValue());
    }
}
