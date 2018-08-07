package com.dingya.number;
/** 
 * 7.有一组数1.1.2.3.5.8.13.21.34。实现这个规律.
 * 
 * @date 2018年4月20日
 * @author dingya
 */
public class P7 {
	/*
	 * 测试方法
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 10; i ++) {
			System.out.print(getNumber(i) + ".");
		}
	}
	
	public static int getNumber(int i) {
		if (i > 2) {
			return getNumber(i - 1) + getNumber(i - 2);
		}
		return 1;
	}
}
