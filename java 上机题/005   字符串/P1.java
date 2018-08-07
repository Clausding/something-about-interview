package com.dingya.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: dingya
 * @Description:1. 获取指定字符串出现的次数
 * @Date: Created in 15:05 2018/6/6
 */
public class P1 {
    /**
     * 测试方法
     *
     * @param args
     */
    public static void main(String[] args) {
        String string = "吃葡萄不吐葡萄皮，不吃葡萄倒吐葡萄皮";
        String targetString = "葡萄";
        int count = count2(string, targetString);
        System.out.print(count);
    }

    /**
     * 利用正则表达式
     *
     * @param string
     * @param targetString
     * @return
     */
    public static int count(String string, String targetString) {
        Pattern p = Pattern.compile(targetString);
        Matcher m = p.matcher(string);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
    }

    /**
     * 利用indexOf(String, int)方法
     *
     * @param string
     * @param targetString
     * @return
     */
    public static int count2(String string, String targetString) {
        int count = 0;
        int index = 0;
        while ((index = string.indexOf(targetString, index)) != -1) {
            count++;
            index++;
        }
        return count;
    }

}
