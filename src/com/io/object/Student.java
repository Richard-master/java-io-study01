package com.io.object;

import java.io.Serializable;

/**
 * @Classname
 * @Description
 * @Date 2023/9/17 10:21
 * @Created by
 */
public class Student implements Serializable {


    private static final long serialVersionUID = -6982374547218543814L;

    private String name;
    private Integer age;
    // transient 瞬时关键字不会让参数序列化到本地文件
    private transient String address;



    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{serialVersionUID = " + serialVersionUID + ", name = " + name + ", age = " + age + "}";
    }
}
