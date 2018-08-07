import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: dingya
 * @Description:字符串所有无重复字符子串中，找出这些子串的最大长度
 * @Date: Created in 9:11 2018/6/19
 * Given a string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc",
 * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class Solution {
    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        String s = "aababcabcd";
        int i = new Solution().lengthOfLongestSubstring2(s);
        System.out.println(i);
    }

    /**
     * 处理所有'ASCII'字符
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring2(String s) {
        int[] appear = new int[256];
        Arrays.fill(appear, -1);
        int start = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (appear[ch] >= start) {
                start = appear[ch] + 1;
            }else {
                result = i - start + 1;
            }
            appear[ch] = i;
        }
        return result;
    }

    /**
     * 处理所有'UTF-8'字符
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        int start = 0;
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            } else {
                result = Math.max(result, i - start + 1);
            }
            map.put(ch, i);
        }
        return result;
    }
}
