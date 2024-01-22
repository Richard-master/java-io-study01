package com.io.object;

import java.io.*;
import java.util.ArrayList;

/**
 * @Classname
 * @Description
 * @Date 2023/9/17 10:51
 * @Created by
 *
 * 需求：
 * 将多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作呢?
 *
 */
public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 创建对象
        Student s1 = new Student("张三",26);
        Student s2 = new Student("lisi",26);
        Student s3 = new Student("王五",26);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        // 创建对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\IDEAProject\\self_project\\练习\\IO\\o.txt"));
        // 输出
        oos.writeObject(students);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\IDEAProject\\self_project\\练习\\IO\\o.txt"));
        // 读取数据
        ArrayList<Student> o =(ArrayList) ois.readObject();
        System.out.println(o);

    }
}
