package com.learning.cart;

import java.util.Scanner;

public class ShopTest {
  // 1、 定义商品类，用于后期创建商品；
  // 2、定义购物车对象，使用一个数组对象表示
  public static void main(String[] args) {
    Goods[] shopCar = new Goods[100];
    boolean flag = true;
    while (flag) {
      System.out.println("请您选择一下命令进行操作：");
      System.out.println("添加商品到购物车： add");
      System.out.println("查询购物车商品展示： query");
      System.out.println("修改商品购买数量：update");
      System.out.println("结算购买商品的金额：pay");
      Scanner sc = new Scanner(System.in);
      System.out.println("请输入命令：");
      String command = sc.next();

      switch (command) {
        case "add":
          addGoods(shopCar, sc);
          break;
        case "query":
          queryGoods(shopCar);
          break;
        case "update":
          updateGoods(shopCar, sc);
          break;
        case "pay":
          payGoods(shopCar);
          break;
        case "finish":
          flag = false;
          break;
        default:
          System.out.println("没有查到对应功能");
      }
    }
  }

  public static void payGoods(Goods[] shopCar) {
    System.out.println("================结算===============");
    double money = 0;
    for (Goods goods : shopCar) {
      if (goods != null) {
        money += (goods.price * goods.buyNum);
      } else {
        break;
      }
    }
    System.out.println("购物车总金额是："+ money);
  }

  public static void updateGoods(Goods[] shopCar, Scanner sc) {
    System.out.println("====================修改商品数量======================");
    while (true) {
      System.out.println("请输入需要修改商品的id：");
      int id = sc.nextInt();
      Goods g = getGoodsById(shopCar, id);
      if(g == null) {
        System.out.println("未找到对应商品");
      }else {
        System.out.println("请输入需要修改的数量");
        int buyNum = sc.nextInt();
        g.buyNum = buyNum;
        break;
      }
    }
  }

  public static Goods getGoodsById(Goods[] shopCar,int id) {
    for (int i = 0; i < shopCar.length; i++)
      if (shopCar[i].id == id) {
        return shopCar[i];
      } else {
        return null;
      }
    return null;
  }

  public static void queryGoods(Goods[] shopCar) {
    System.out.println("================查询购物车商品==============");
    System.out.println("编号\t\t\t名称\t\t\t价格\t\t\t购买数量");
    for (int i = 0; i < shopCar.length; i++) {
      if(shopCar[i] == null && i == 0) {
        System.out.println("\t\t\t\t\t当前购物车为空！");
        break;
      }else if(shopCar[i] == null){
        break;
      }else {
        System.out.println(shopCar[i].id+"\t\t\t"+shopCar[i].name+"\t\t\t"+shopCar[i].price+"\t\t\t"+shopCar[i].buyNum);
      }

    }
  }

  public static void addGoods(Goods[] shopCar, Scanner sc) {
    // 录入用户输入的购买商品的信息
    System.out.println("请输入商品的编号（不重复）");
    int id = sc.nextInt();
    System.out.println("请输入商品的名称：");
    String name = sc.next();
    System.out.println("请输入商品的价格：");
    double price = sc.nextDouble();
    System.out.println("请输入购买数量：");
    int buyNum = sc.nextInt();
    // 封装成商品对象
    Goods g = new Goods();
    g.id = id;
    g.name = name;
    g.price = price;
    g.buyNum = buyNum;

    // 把商品加入到购物车中
    for (int i = 0; i < shopCar.length; i++) {
      if(shopCar[i] == null) {
        shopCar[i] = g;
        break;
      }
    }

    System.out.println("商品"+ name + "添加成功");

  }


}
