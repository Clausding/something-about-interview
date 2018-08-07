package com.dingya.number;
/** 
 * 13.原地交换两个变量的值
 * 
 * @date 2018年4月27日
 * @author dingya
 */
public class P13 {
	
	/*
	 * 测试方法
	 */
	public static void main(String[] args) {
		int a = 33;
		int b = 2;
		swap2(a, b);
	}

	/*
	 * 方法2：一个数异或同一个数两次，运算结果和原数字相同字 
	 * 推荐这种方法，效率高，没有损失精度的风险
	 */
	public static void swap2(int a, int b) {
		System.out.printf("a=%d,b=%d%n", a, b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.printf("a=%d,b=%d%n", a, b);
	}

	/*
	 * 方法1：作和作差法
	 */
	public static void swap1(int a, int b) {
		System.out.printf("a=%d,b=%d%n", a, b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.printf("a=%d,b=%d%n", a, b);
	}
}
