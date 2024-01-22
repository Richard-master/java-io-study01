package com.io.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Classname
 * @Description
 * @Date 2023/9/16 22:44
 * @Created by
 *
 * // 2-1-9-4-7-8  转为  1-2-4-7-8-9
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\IDEAProject\\self_project\\练习\\IO\\a.txt");
        StringBuffer buffer = new StringBuffer();
        char[] chars = new char[1024];
        int len;
        while((len = fr.read(chars)) != -1){
            buffer.append(chars);
        }
        fr.close();

        System.out.println(buffer);

        Arrays.stream(buffer.toString().trim()
                .split("-"))
                .map(Integer::parseInt)
                .forEach(System.out::println);


//        Integer[] arr = Arrays.stream(buffer.toString()
//                .split("-"))
//                .map(Integer::parseInt)
//                .sorted()
//                .toArray(Integer[]::new);
//
//        System.out.println(Arrays.toString(arr));
    }
}
