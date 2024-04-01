package com.itheima.base;

import java.util.Arrays;

public class Base {
    public static void main(String[] args) {
        // 定义数据 静态化数组；
        // 数据类型[] 数组名 = new 数据组类型[] {""}
        // 简化格式 数据类型[] 数组名 = {元素一，元素二， ······}
        // 数据类型 数组名[] = {元素一，元素二， ······}
        String[] name = {"a", "b", "c","d","e","f","g"};
        double[] scores = new double[]{99.5, 23, 489.0};
        int arr[] = {1,2,3,4};
        System.out.println(scores);  // [D@3fee733d
        System.out.println(arr[2]);  // 3
        // 数组的访问 数组名称[索引]
        double i = scores[0];
        System.out.println(i); // 99.5
        System.out.println(Arrays.toString(arr));

        System.out.println("_____________________________________");
        // 动态定义数组
//        数据类型[] 数组名 = new 数据类型[长度]
        int array[] = new int[5];
        System.out.println(array.length);
    }
}
