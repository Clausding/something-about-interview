package com.dingya.number;

/**
 * 14.找出4字节整数的中位数
 * 
 * @date 2018年4月27日
 * @author dingya
 */
public class P14 {
	public static void main(String[] args) {
		long min = Integer.MIN_VALUE;
		long max = Integer.MAX_VALUE;
		System.out.println(min);
		System.out.println(max);
		// 4字节整数是int类型，总数量是偶数，所以中位数是中间两数均值，就是0和-1的均值
		double middle = (0 - 1) / 2.0;
		System.out.println(middle);
	}
}
