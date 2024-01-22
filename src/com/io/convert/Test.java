package com.io.convert;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @Classname
 * @Description
 * @Date 2023/9/17 9:53
 * @Created by
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*
            利用转换流按照指定的字符编码读取

            //1.JDK11以前的方案
            InputStreamReader isr = new InputStreamReader(new FileInputStream( name: "myiollb,txt"), charsetName: "GBk");
            OutputStreamWriter osw = new 0utputStreamWriter(new File0utputStream( name: "myiolld.txt"), charsetName: "UTF-8").
         */

        /*// 1. 创建对象并制定字符编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\IDEAProject\\self_project\\练习\\IO\\convert.txt"),"utf-8");
        // 2. 读取数据
        int ch;
        while((ch = isr.read())!=-1){
            System.out.print((char)ch );
        }
        isr.close();*/

        FileWriter fw = new FileWriter("myiollc.txt",Charset.forName("GBK"));
        fw.write("你好你好");
        fw.close();

        /*
            转换流:
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("")));

                字节流       ->       字符流       ->     字符缓冲流
            FileInputStream -> InputStreamReader -> BufferedReader
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("")));
    }
}
