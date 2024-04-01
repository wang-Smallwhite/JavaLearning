package com.itheima.randomDemo;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(10) + 1;
        System.out.println(number);


        System.out.println("_________________________________");

        // 猜数字游戏 1- 100 直接数字，猜大小，直到猜对为止
        int okNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入你猜的数据（1-100）：");
            int guessNum = sc.nextInt();

            if(guessNum > okNum) {
                System.out.println("猜测数据太大了");
            }else if(guessNum < okNum) {
                System.out.println("猜测数据太小了");
            }else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
