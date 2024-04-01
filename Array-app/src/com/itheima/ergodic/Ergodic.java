package com.itheima.ergodic;

public class Ergodic {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        // 简介写法
        for (int j : arr) {
            System.out.println(j + "---");
        }
//        数组求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        System.out.println(sum);

//        数组求最值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);










    }
}
