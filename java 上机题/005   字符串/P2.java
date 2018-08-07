package com.dingya.string;

/**
 * @Author: dingya
 * @Description: 2. 判断一个字符串是否是回文字符串(回文就是正反读一样)
 * @Date: Created in 15:28 2018/6/6
 */
public class P2 {
    /**
     * 测试方法
     *
     * @param args
     */
    public static void main(String[] args) {
        String string = "abcba";
        boolean b = isPalindrome(string);
        System.out.println(b);
    }

    /**
     * 判断一个字符串是否是回文字符串
     * @param string
     * @return
     */
    public static boolean isPalindrome(String string) {
        int low = 0;
        int high = string.length() - 1;
        while (low < high) {
            if (string.charAt(low) != string.charAt(high)) {
                return false;
            }
            low ++;
            high --;
        }
        return true;
    }
}
