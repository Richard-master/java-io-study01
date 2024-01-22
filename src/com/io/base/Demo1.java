package com.io.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Classname
 * @Description
 * @Date 2023/9/16 22:28
 * @Created by
 * <p>
 * 拷贝文件
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        // 定义数据源
        File src = new File("D:/upload");
        // 定义目的地
        File dest = new File("D:/copy");
        // 拷贝文件
        copydir(src, dest);
    }

    private static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();
        // 递归
        // 1.进入数据源
        File[] files = src.listFiles();
        // 2.遍历数组
        for (File file : files) {
            if (file.isFile()) {
                // 3.判断文件，拷贝
                FileInputStream fis = new FileInputStream(file);

                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            } else {
                // 4.判断文件，递归
                copydir(file,new File(dest,file.getName()));
            }
        }

    }
}
