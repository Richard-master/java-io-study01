package com.io;

import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @Classname
 * @Description
 * @Date 2023/9/17 9:29
 * @Created by
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个ConcurrentSkipListSet
        ConcurrentSkipListSet<Integer> sortedSet = new ConcurrentSkipListSet<>();

        // 向集合中添加元素
        sortedSet.add(5);
        sortedSet.add(2);
        sortedSet.add(8);
        sortedSet.add(1);
        sortedSet.add(7);

        // 打印排序后的元素
        System.out.println("排序后的元素:");
        for (Integer element : sortedSet) {
            System.out.println(element);
        }


        // 创建一个ConcurrentSkipListMap
        ConcurrentSkipListMap<Integer, String> sortedMap = new ConcurrentSkipListMap<>();

        // 向映射中添加键值对
        sortedMap.put(5, "Five");
        sortedMap.put(2, "Two");
        sortedMap.put(8, "Eight");
        sortedMap.put(1, "One");
        sortedMap.put(7, "Seven");

        // 打印排序后的键值对
        System.out.println("排序后的键值对:");
        for (Integer key : sortedMap.keySet()) {
            String value = sortedMap.get(key);
            System.out.println(key + ": " + value);
        }


    }
}
