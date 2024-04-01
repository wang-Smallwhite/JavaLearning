package com.itheima.arraymemory;

/*
* java 内存分配
*
* 方法区域      栈区域         堆区域
*
* */

public class ArrayMemory {
    public static void main(String[] args) {
        int a = 12;
        System.out.println(a);

        int[] arr = {1, 2, 3};
        int[] brr = arr;
        System.out.println(brr + "__brr");
        System.out.println(arr);
        arr[0] = 33;
        arr[1] = 44;
        arr[2] = 55;
        brr[1] = 92;
        System.out.println(arr[0]); // 33
        System.out.println(brr[0]); // 33
        System.out.println(arr[1]); // 92
        System.out.println(brr[1]); // 92
    }
}
