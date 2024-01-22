package com.io.object;

import java.io.*;

/**
 * @Classname
 * @Description
 * @Date 2023/9/17 10:20
 * @Created by
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("张三",26);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\IDEAProject\\self_project\\练习\\IO\\o.txt"));
        oos.writeObject(student);
        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\IDEAProject\\self_project\\练习\\IO\\o.txt"));
        Object o = ois.readObject();
        System.out.println(o);

    }
}
