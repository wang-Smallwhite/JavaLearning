package com.learning.caseDemo;

import java.util.Arrays;
import java.util.Random;

public class caseDemo {
  public static void main(String[] args) {
    System.out.println(createCode(5));

    int[] arr1 = {1,2,3,4,5};
    int[] arr2 = arr1;
    arr2[1] = 10;
    System.out.println(Arrays.toString(arr2)); // 1,10,3,4,5
    System.out.println(Arrays.toString(arr1));  // 1,10,3,4,5

    int[] brr1 = {1,2,3};
    int[] brr2 = new int[brr1.length];
    copy(brr1, brr2);
    brr2[1] = 10;
    System.out.println(Arrays.toString(brr2)); // 1, 10 ,3
    System.out.println(Arrays.toString(brr1)); // 1, 2, 3
  }

  // 生成随机验证码， 数字、大小写字母不限制
  public static String createCode(int len) {
    Random r = new Random();
    String code = "";
    for (int i = 0; i < len; i++) {
      // 生成随机字符 小写字母、大写字母、数字（0，1，2）
      int type = r.nextInt(3);
      switch(type) {
        case 0:
          char ch = (char)(r.nextInt(26) + 65);
          code+=ch;
          break;
        case 1:
          char ch1 = (char)(r.nextInt(26) + 97);
          code+=ch1;
          break;
        case 2:
          int ch2 = r.nextInt(10);
          code+=ch2;
          break;
      }
    }
    return code;
  }

  // 数组的复制 （深拷贝）
  public static void copy(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = arr1[i];
    }
  }
}
