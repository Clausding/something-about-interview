/**
 * @Author: dingya
 * @Description:找到最大回文子串
 * @Date: Created in 9:14 2018/6/21
 * Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000,
 * and there exists one unique longest palindromic substring.
 */
public class Solution {
	/**
	 * 测试方法
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "abcba--aaaa--";
		String s1 = new Solution().longestPalindrome(s);
		System.out.println(s1);
	}

	/**
	 * 找到最大回文子串
	 *
	 * @param string
	 * @return
	 */
	public String longestPalindrome(String string) {
		int minLen = 2;
		int maxLen = 0;
		String maxSubstring = null;
		int strLen = string.length();
		if (string == null || string.length() < minLen) {
			return string;
		}
		/**
		 * 记录字符串回文情况，例如table[i][j]=true代表下标i到j的字符串是回文串
		 */
		boolean[][] table = new boolean[strLen][strLen];
		//长度为1的子串都是回文
		for (int i = 0; i < strLen; i++) {
			table[i][i] = true;
			maxLen = 1;
			maxSubstring = string.substring(i, i + 1);
		}
		//长度为2的子串
		for (int i = 0; i < strLen - 1; i++) {
			if (string.charAt(i) == string.charAt(i + 1)) {
				table[i][i + 1] = true;
				maxSubstring = string.substring(i, i + 2);
				maxLen = 2;
			}
		}
		//长度大于2的子串
		for (int len = 3; len < strLen + 1; len++) {
			for (int i = 0, j; (j = i + len - 1) < strLen; i++) {
				if (string.charAt(i) == string.charAt(j)) {
					table[i][j] = table[i + 1][j - 1];
					if (table[i][j] && maxLen < len) {
						maxLen = len;
						maxSubstring = string.substring(i, j + 1);
					}
				} else {
					table[i][j] = false;
				}
			}
		}
		System.out.println("maxLen:"+maxLen);
		return maxSubstring;
	}
}
