package com.dingya.number;

/**
 * 8.计算指定数字的阶乘
 * 
 * @date 2018年4月20日
 * @author dingya
 */
public class P8 {
	public static void main(String[] args) throws Exception {
		long result = getFactorial(13);
		System.out.println(result);
	}

	/*
	 * 求整数的阶乘
	 */
	public static long getFactorial(long num) throws Exception {
		long result = 0;
		if (num < 0) {
			throw new Exception("负数的阶乘不存在");
		}
		if (num == 0) {
			result = 1;
		}
		if (num > 0) {
			result = 1;
			for (long i = 1; i < num + 1; i++) {
				result = i * result;
			}
		}
		return result;
	}
}