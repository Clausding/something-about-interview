package com.dingya.number;

/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 * 总结:高度值要用double类型表示.如果使用int类型,当高度小于1再除以2，高度值就变为0了
 * 
 * @date 2018年4月20日
 * @author dingya
 */
public class P5 {
	public static void main(String[] args) {
		double sum = 0;
		double reflectHeight = 100;
		// 从球开始下落到反跳到最高点,这一个过程作为一个循环
		for (int i = 0; i < 10; i++) {
			sum += reflectHeight;
			reflectHeight /= 2;
			sum += reflectHeight;
			System.out.printf("经过%f米, 回跳%f米%n", sum, reflectHeight);
		}
		System.out.printf("它在 第10次落地时，共经过%f米%n", sum);
		System.out.printf("第10次反弹%f米", reflectHeight);
	}
}
