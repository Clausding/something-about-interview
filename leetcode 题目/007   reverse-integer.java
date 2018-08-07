/**
 * @Author: dingya
 * @Description:反转int值
 * @Date: Created in 9:41 2018/6/25
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class Solution {
    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        int i = -129;
        int result = new Solution().reverseInt(i);
        System.out.println(result);
    }

    public int reverseInt(int i) {
        long result = 0;
        long temp = i;
        while (temp != 0) {
            result = result * 10 + temp % 10;
            temp = temp / 10;
        }
        //判断结果是否溢出int取值范围
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) result;
    }
}
