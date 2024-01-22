package com.io.random_access;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Classname
 * @Description
 */
public class RandomAccessFileDemo{
    public static void main(String[] args) throws IOException {
        // 从指针位置读取文件
        RandomAccessFile raf = new RandomAccessFile("D:\\IDEAProject\\self_project\\练习\\IO\\a.txt","rw");

        // 移动文件记录指针的位置
        raf.seek(3);
        byte[] bytes = new byte[4];
        int len = 0;
        while((len = raf.read(bytes))!= -1){
            System.out.print(new String(bytes,0,len));
        }


        long length = raf.length();
        raf.seek(length);
        raf.write("123".getBytes());

        raf.close();
    }
}
