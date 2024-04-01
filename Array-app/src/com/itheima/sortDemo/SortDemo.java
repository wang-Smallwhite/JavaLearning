package com.itheima.sortDemo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortDemo {
    public static void main(String[] args) {
        //数组的随机排序
//        int[] codes = new int[5];
//
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < codes.length; i++) {
//            System.out.println("请您输入第" + (i+1) + "个员工的工号：");
//            int code= sc.nextInt();
//            codes[i] = code;
//        }
//
//        // 随机一个索引，让该元素与随机索引的元素换位置
//
//        Random r = new Random();
//        for (int i = 0; i < codes.length; i++) {
//
//            int index = r.nextInt(codes.length);
//
//            int temp = codes[index];
//            codes[index] = codes[i];
//            codes [i] = temp;
//        }
//
//        System.out.println(Arrays.toString(codes));


        // 冒泡排序
        int[] arr = {5, 3, 2, 8, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));


    }
}
