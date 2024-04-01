package com.learning.methods;

import java.util.Scanner;

public class MethodsBase {
  public static void main(String[] args) {
    // 方法好处 减少代码冗余，提高复用性
    int rs = add(10, 20);
    System.out.println(rs);

    System.out.println(sum(100));

    System.out.println("请输入一个整数，来判断是奇数还是偶数：");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    isInt(num);
  }
  // 定义方法
  /*
   * 修饰符 返回值类型 方法名（形参列表） {
   * 方法具体代码
   * return 返回值
   *
   * 形参列表 不能有初始值
   * */
  //    对两个整数求和
  public static int add(int a, int b) {
    return a + b;
  }

  /*
  * 无参数、无返回值方法
  * */
  public static void print() {
    System.out.println("print");
  }

  /*
  * 🌼 方法的编写顺序无所谓
  * 方法与方法之间是平级关系，不能嵌套；
  * 方法的返回类型 void 无返回值，方法内则不能使用return；
  * 有返回值的方法调用可以选择定义变量接受结果，或者专辑输出调用，甚至直接调用；无返回值方法的调用只能直接调用一下
  * */


  // 计算 1 - n 的和
  public static int sum (int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum+=i;
    }
    return sum;
  }


  // 判断 一个整数 是奇数还是偶数
  public static void isInt(int x) {
    if(x % 2 == 0) {
      System.out.println(x+"是偶数");
    }else {
      System.out.println(x+"是奇数");
    }
  }
}
