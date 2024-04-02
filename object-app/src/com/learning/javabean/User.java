package com.learning.javabean;
/*
* 封装的实体类 其对象可以用于在程序中封装数据
*
* 标准：1、成员变量使用 private 修饰
*     2、提供每个成员变量对应的 setXxx() / getXxx()
*     3、必须提供一个无参构造器
* */
public class User {
  // 成员变量私有化
  private String name;
  private double height;
  private int age;
  private char set;

//  可不写， 但是当有参构造器出现，必须手写一个无参构造器
  public User() {}

  //参构造器
  public User(String name, double height, int age, char set) {
    this.name = name;
    this.height = height;
    this.age = age;
    this.set = set;
  }

  // 提供getter setter方法
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public char getSet() {
    return set;
  }

  public void setSet(char set) {
    this.set = set;
  }
}
