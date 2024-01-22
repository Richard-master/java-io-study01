package com.io.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Classname
 * @Description
 * @Date 2023/9/16 20:22
 * @Created by
 *
 * write(int)
 * write(byte[])
 * write(byte[],offset,length)
 *
 */
public class IOTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\IDEAProject\\self_project\\练习\\IO\\src\\com\\io\\base\\a.txt",true);
        FileOutputStream fos1 = new FileOutputStream("D:\\IDEAProject\\self_project\\练习\\IO\\src\\com\\io\\base\\b.pdf",true);

        // 写入
        fos.write(97);
        fos.write(98);

        byte[] bytes = {97,98,99,100,101};
        // 写入byte[]
        fos.write(bytes);
        // write写的时候结束了会返回-1
        // 根据偏移写入
        fos.write(bytes,1,2);

        //写入字符串
        String s = "\r\naiqejqkwkeqeq";
        byte[] bytes1 = s.getBytes();
        fos.write(bytes1);

        fos.close();


        FileInputStream fis = new FileInputStream("D:\\IDEAProject\\self_project\\练习\\IO\\src\\com\\io\\base\\a.txt");
        // read()读的是ASCII码
        // 读完了返回-1
        int read = fis.read();
        System.out.println(read);

        // 循环读取
        int b;
        while( (b = fis.read())!= -1){
            System.out.print((char)b);
        }
        fis.close();


        // 文件copy
        FileInputStream fis1 = new FileInputStream("D:\\百度网盘下载文件\\1658页 Java面试突击核心讲.pdf");
        long start = System.currentTimeMillis();
        // 循环读取
        byte[] byte1 = new byte[1024 * 1024 * 5];
        int len;
        while((len = fis1.read(byte1))!= -1){
            fos1.write(byte1);
        }
        fis1.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
