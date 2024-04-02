package com.learning.base;

public class Car {
  /*
   * public class 类名 {
   *   构造器
   *   成员变量 代表属性
   *   成员方法 代表行为
   *   构造器
   *   代码块
   *   内部类
   * }
   *
   * */

  String name;
  double price;
  // 无参数构造器 默认就有
//  public Car() {
//
//  }
  // 有参构造器
  public Car (String name, double price) {
    this.name = name;
    this.price = price;
  }
  public void start() {
    System.out.println("价值"+price + "的" + name + "已经启动！");
  }

  public void run(String name){
    System.out.println(this.name + "正在和" + name + "进行比较！");
  }
}