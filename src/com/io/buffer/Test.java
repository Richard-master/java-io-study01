package com.io.buffer;

import java.io.*;

/**
 * @Classname
 * @Description
 * @Date 2023/9/17 8:54
 * @Created by
 *
 * 需求:
 * 利用字节缓冲流拷贝文件
 * 字节缓冲输入流的构造方法:   public BufferedInputStream(InputStream is)
 *
 * 字节缓冲输出流的构造方法:   public BufferedOutputstream(Outputstream os)
 *
 */
public class Test {
    public static void main(String[] args) throws IOException {

        // 每个字节读取
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\IDEAProject\\self_project\\练习\\IO\\a.txt"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\IDEAProject\\self_project\\练习\\IO\\b.txt"));
//        int b;
//        while((b=bis.read())!=-1){
//            bos.write(b);
//        }
//        bis.close();
//        bos.close();



        BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("D:\\IDEAProject\\self_project\\练习\\IO\\a.txt"));
        BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("D:\\IDEAProject\\self_project\\练习\\IO\\b.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while((len=bis1.read(bytes))!=-1){
            bos1.write(bytes,0,len);
        }
        bis1.close();
        bos1.close();
    }
}
