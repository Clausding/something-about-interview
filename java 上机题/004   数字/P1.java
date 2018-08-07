package com.dingya.number;

/**
 * 判断101-200之间有多少个素数，并输出所有素数
 * 
 * @date 2018-06-06
 * @author dingya
 */
public class P1 {
	public static void main(String[] args) {
		int sum = 0;
		int start = 101;
		int end = 201;

		for (int i = start; i < end; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i);
				sum++;
			}
		}

		System.out.printf("素数的个数是:%d", sum);
	}

	/*
	 * 判断一个int变量是否为素数
	 */
	private static boolean isPrimeNumber(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}