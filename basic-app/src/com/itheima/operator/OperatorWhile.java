package com.itheima.operator;

import java.util.Scanner;

public class OperatorWhile {
    public static void main(String[] args) {
        // while 循环
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }

        // 珠穆朗玛峰 8848.86 米，
        double peakHeight = 8848868;
        double pageThickness = 0.1;
        int count = 0;
        while(pageThickness < peakHeight) {
            pageThickness *= 2;
            count++;
        }
        System.out.println(count);


        System.out.println("_____________________________________");

        // do {} while()
        int n = 0;
        do{
            System.out.println(n);
            n++;
        }while(n < 3);


        // 定义死循环
//        for (;;) {
//            System.out.println("for");
//        }

//        while(true){
//            System.out.println("死循环");
//        }

        System.out.println("----------------------------------------------");
        Scanner sc = new Scanner(System.in);
        int okPassword = 520;
        while (true) {
            System.out.println("请输入密码");
            int password = sc.nextInt();
            if(password == okPassword) {
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("密码错误");
            }
        }


    }
}
