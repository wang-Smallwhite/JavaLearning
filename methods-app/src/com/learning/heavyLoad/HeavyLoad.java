package com.learning.heavyLoad;

public class HeavyLoad {
/*
* 方法的重载
* 同一个类中，出现了多个方法名称相同，但是形参列表不同的，那么这些方法就是重载方法
* 需试别方法重载的形式，并理解其调用的流程，最后需要知道方法重载的好处
*
* */
  public static void main(String[] args) {
    fire();
    fire("岛国");
    fire("岛国", 90);
  }

  public static void fire() {
    System.out.println("打印输出");
  }
  public static void fire(String location) {
    System.out.println("打印输出" + location);
  }
  public static void fire(String location,int number) {
    System.out.println("打印输出"+ location + number);
  }



}
