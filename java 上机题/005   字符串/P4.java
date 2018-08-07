package com.dingya.string;

import java.io.UnsupportedEncodingException;

/**
 * @Author: dingya
 * @Description: 4. 将GB2312编码的字符串转换为ISO-8859-1编码的字符串
 * @Date: Created in 15:55 2018/6/6
 */
public class P4 {
    /**
     * 测试方法
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        String string = "吃葡萄不吐葡萄皮，不吃葡萄倒吐葡萄皮";
        byte[] bytes = string.getBytes();
        String string2 = new String(bytes, "ISO-8859-1");
        System.out.println(string2);
    }
}
