package com.io.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Classname
 * @Description
 * @Date 2023/9/16 21:22
 * @Created by
 * <p>
 * 第一步:创建对象
 * public FileReader(File file)         创建字符输入流关联本地文件
 * public FileReader(String pathname)   创建字符输入流关联本地文件
 * <p>
 * 第二步:读取数据
 * public int read()                    读取多个数据，读到末尾返回-1
 * public int read(char[] buffer)       读取数据，读到末尾返回-1
 * <p>
 * <p>
 * 第三步:释放资源
 * public void close()                  释放资源/关流
 */
public class IOTest3 {
    public static void main(String[] args) throws IOException {
        //1.创建对象并关联本地文件
        FileReader fr = new FileReader("D:\\IDEAProject\\self_project\\练习\\IO\\a.txt");
        //2.读取数据 read()
        //字符流的底层也是字节流，默认也是一个字节一个字节的读取的。
        // 如果遇到中文就会一次读取多个，GBK一次读两个字节，UTF-8一次读三个字节int ch;

        //read () 细节:
        //1.read():默认也是一个字节一个字节的读取的,如果遇到中文就会一次读取多个
        // 2. 底层：读取->解码->转十进制->返回
        //英文: 文件里面二进制数据 0110 0001
        //      read方法进行读取，解码并转成十进制97
        //中文: 文件里面的二进制数据 11100110 10110001 10001001
        //      read方法进行读取，解码并转成十进制27721
        // 我想看到中文汉字，就是把这些十进制数据，再进行强转就可以了

        /**
         * 第二步: 读取数据
         * void write(int c)
         * 写出一个字符写出一个字符串写出一个字符串的一部分写出一个字符数组
         * void write(String str)
         * void write(String str, int off, int len)
         * void write(char[] cbuf)
         * void write(char[] cbuf, int off, int len)写出字符数组的一部分
         */


        /**
         * 字符流有个8192字节的缓冲区
         */
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }
        //3.释放资源
        fr.close();

        // 有参的构造方法：
        // 底层：读取->解码->强转成char
        FileReader fr1 = new FileReader("D:\\IDEAProject\\self_project\\练习\\IO\\a.txt");
        char[] chars = new char[1024];
        int len;
        while ((len = fr1.read(chars)) != -1) {
            System.out.print(new String(chars,0,len));
        }
        //3.释放资源
        fr1.close();

    }
}
