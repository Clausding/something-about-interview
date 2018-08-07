package com.dingya.string;

/**
 * @Author: dingya
 * @Description:3. 将一个字符串反转（利用递归）
 * @Date: Created in 15:50 2018/6/6
 */
public class P3 {
	public static void main(String[] args) {
		String string = "are you ok?";
		String reverseString = reverse(string);
		System.out.println(reverseString);
		
		// StringBuffer的方法反转字符串
		StringBuffer sb = new StringBuffer(reverseString);
		sb.reverse();
		System.out.println(sb.toString());
	}

	/**
	 * 使用递归反转字符串
	 * @param string
	 * @return
	 */
	public static String reverse(String string) {
		if (string == null || string.length() <= 1) {
			return string;
		}
		return reverse(string.substring(1)) + string.charAt(0);
	}
}
