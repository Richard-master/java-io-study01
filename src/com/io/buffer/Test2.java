package com.io.buffer;

import java.io.*;

/**
 * @Classname
 * @Description
 * @Date 2023/9/17 9:09
 * @Created by
 *
 * 字符缓冲输入流:构造方法:
 * public BufferedReader(Reader r)     特有方法:
 * public String readLine()            读一整行
 *
 * 虽然字符流基础流底层自带了8192的缓冲区，但是buffer流带有readLine和newLine独有的方法
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\IDEAProject\\self_project\\练习\\IO\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IDEAProject\\self_project\\练习\\IO\\c.txt"));

        String line;
        while((line = br.readLine())!=null){
            bw.write(line);
        }
        bw.close();
        br.close();
    }
}
