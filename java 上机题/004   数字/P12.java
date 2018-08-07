package com.dingya.number;

/**
 * 12.打印出所有的 “水仙花数 “，所谓 “水仙花数 “是指一个三位数，其各位数字立方和等于该数本身。例如：153
 * 
 * @date 2018年4月27日
 * @author dingya
 */

public class P12 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			if (isFind(i)) {
				System.out.println(i);
			}
		}
	}

	/**
	 * 判断1个三位正整数是不是水仙花数
	 */
	private static boolean isFind(int abc) {
		int a = abc / 100;
		int b = abc / 10 - 10 * a;
		int c = abc - 10 * b - 100 * a;
		int result = a * a * a + b * b * b + c * c * c;
		if (result == abc) {
			return true;
		}
		return false;
	}
}
