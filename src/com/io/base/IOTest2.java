package com.io.base;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Classname
 * @Description
 * @Date 2023/9/16 21:11
 * @Created by
 */
public class IOTest2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /**
         * Java中编码的方法
         * public byte[] getBytes()
         * public byte[] getBytes(String charsetName)
         *
         *
         * Java中解码的方法
         * String(byte[] bytes)                       使用默认方式进行编码使用指定方式进行编码
         * String(byte[] bytes, string charsetName)   使用默认方式进行解码使用指定方式进行解码
         *
         *
         * 在GBK中，中文是2字节
         * 在utf-8中，中文是3字节
         * 所以编码解码不同会导致字节乱码
         */

        //1.编码
        String str ="ai你呦";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));
        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));


        //2.解码
        String str2 = new String(bytes1);
        System.out.println(str2);
        String str3 = new String(bytes1,"GBK");
        System.out.println(str3);
    }
}
