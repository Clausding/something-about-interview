package com.dingya.number;

/**
 * 9.开发 Fizz Buzz (“编写程序把1-100的数字打印出来。不过，要把3的倍数打成"Fizz"，把5的倍数打成"Buzz"。
 * 而如果一个数既是3的倍数。又是5的倍数时，就打成"Fizz-Buzz"，其余的输出数字。)
 * 
 * @date 2018年4月20日
 * @author dingya
 */
public class P9 {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			String string = fizzBuzz1(i);
			System.out.println(string);
		}
	}

	private static String fizzBuzz1(int i) {
		String forPrint = "";
		if (i % 3 == 0) {
			if (i % 5 == 0) {
				forPrint = "Fizz-Buzz";
			} else {
				forPrint = "Fizz";
			}
		} else if (i % 5 == 0) {
			forPrint = "Buzz";
		} else {
			forPrint = "" + i;
		}
		return forPrint;
	}
}
