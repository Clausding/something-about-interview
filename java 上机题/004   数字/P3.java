package com.dingya.number;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. 编写代码找出1000以内的所有完数
 * 一个数如果恰好等于它的因子之和，这个数就称为 "完数"。例如6=1＋2＋3.
 *
 * @author dingya
 * @date 2018年4月20日
 */
public class P3 {

    public static void main(String[] args) {
        int num = 1001;
        for (int i = 1; i < num; i++) {
            boolean isWanNumber = isWanNumber(i);
            if (isWanNumber) {
                System.out.println(i);
            }
        }
    }

    /**
     * 判断一个整数是否是完数
     *
     * @param intNumber
     * @return
     */
    public static boolean isWanNumber(int intNumber) {
        if (intNumber < 1) {
            return false;
        }

        int sum = 0;
        List<Integer> factors = getFactors(intNumber);
        for (Integer integer : factors) {
            sum += integer;
        }

        if (sum == intNumber) {
            return true;
        }
        return false;
    }

    /**
     * 找出一个正整数所有的因数
     *
     * @param intNumber
     * @return
     */
    public static List<Integer> getFactors(int intNumber) {
        if (intNumber < 1) {
            return null;
        }
        List<Integer> result = new ArrayList<Integer>();
        int num = intNumber / 2 + 1;
        for (int i = 1; i < num; i++) {
            if (intNumber % i == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
