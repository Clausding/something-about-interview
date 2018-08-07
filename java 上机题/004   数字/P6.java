package com.dingya.number;

/**
 * 6. 求s=a+aa+aaa+aaaa+aa…a的值，其中a是一个数字。例如2+22+222+2222+22222
 * 
 * @date 2018年4月20日
 * @author dingya
 */
public class P6 {
	public static void main(String[] args) {
		int sum = getSum(6, 2);
		System.out.println(sum);
	}

	private static int getSum(int n, int a) {
		int result = 0;
		int a1 = 0;
		for (int i = 0; i < n; i++) {
			a1 = a1 * 10 + a;
			result += a1;
			System.out.printf("a1的值是:%d,result的值是:%d%n", a1, result);
		}
		return result;
	}
}
