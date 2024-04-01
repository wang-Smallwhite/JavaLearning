package com.learning.parameter;

public class parameter {
  public static void main(String[] args) {
    // java 基本类型的参数传递：值传递
    int a = 10;
    change(a);
    System.out.println(a);


    // java 引用类型的参数传递
    int[] arr = {1,2,3,4,5};
    int[] brr = {1,2,3};
    changeArr(arr);
    System.out.println(arr[0]);

    System.out.println(searchIndex(arr,3));
    System.out.println(searchIndex(arr,7));
    System.out.println(compare(arr, brr));
  }

  public static void change(int a) {
    System.out.println(a);
    a += 10;
    System.out.println(a);
  }
  public static void changeArr(int[] a) {
    System.out.println(a[0]);
    a[0] = 10;
    System.out.println(a[0]);
  }


  // 实现JavaScript findindex（） 方法
  public static int searchIndex(int[] arr, int n) {
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == n) {
        return i;
      }
    }
    return -1;
  }

  // 比较任意两个数据下的子元素是否一样
  public static boolean compare(int[]arr1, int[] arr2) {
    if(arr1.length == arr2.length) {
      for (int i : arr1) {
        if(arr1[i] != arr2[i]) {
          return false;
        }
      }
      return true;
    }else {
      return false;
    }
  }
}
