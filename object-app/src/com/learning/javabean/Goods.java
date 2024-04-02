package com.learning.javabean;

public class Goods {

  private int id; // 编号
  private String name; // 名称
  private double price; // 价格
  private int buyNum; // 购买数量

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getBuyNum() {
    return buyNum;
  }

  public void setBuyNum(int buyNum) {
    this.buyNum = buyNum;
  }
}
