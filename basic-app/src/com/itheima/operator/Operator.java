package com.itheima.operator;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        // 基本运算符： + - * / %
        int a = 10;
        int b = 3;
        double c = 2.5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a / c);
        System.out.println("______________________________________");

        // 拆分 个位、 十位 、百位；
        int num = 893;
        System.out.println(num % 10);
        System.out.println(num / 10 % 10);
        System.out.println(num / 100);
        System.out.println("__________________________________");


        // 连接符号 +
        int price = 89;
        System.out.println("今日消费：" + price);
        System.out.println('a' + price);  // 186
        System.out.println("a" + price);  // a89


        System.out.println("________________________ 自增自减______________________");
        // 自增 自减
        int n = 1;
//        System.out.println(--n); // 0
//        System.out.println(++n); // 1
//        System.out.println(n--); // 1
//        System.out.println(n++); // 1
        // 先赋值 自身变量在自增
        int m = n++;
        System.out.println(m); // 1
        System.out.println(n); // 2
        // 先自增，再赋值
        int p = 1;
        int o = ++p;
        System.out.println(o);  // 2
        System.out.println(p);  // 1
        // 案例
        int q = 10;
        int w = 5;
        int result = q++ + ++q - --w - ++w + 1 + q--;
        // q 11 12 11
        // w 4 5
        // result 10 + 12 - 4 - 5 + 1 + 12
        System.out.println(q); // 11
        System.out.println(w); // 5
        System.out.println(result); // 26


        System.out.println("_____________________赋值运算_______________________");

        // = 、+=、 -=、 *=、 /=、 %=

        int s = 10;
        int i = 9;
        s += i;
        System.out.println(s + " " + i);

        System.out.println("__________________关系运算符_____________");
        // ==、 !=、 >、 >=、 <、 <=、
        System.out.println(9 == 0);
        System.out.println(9 != 0);
        System.out.println(9 > 0);
        System.out.println(9 >= 0);
        System.out.println(9 < 0);
        System.out.println(9 <= 0);


        System.out.println("__________________逻辑运算符_______________");
        // 逻辑运算符  &、 |、 !、 ^
        System.out.println(true & false);  // false
        System.out.println(true | false); // true
        System.out.println(true & !false); // true
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false        System.out.println(false ^ true); // true
        System.out.println(true ^ true); // false
        System.out.println("__________________________________");
        // && 与 & ； || 与 ｜;
        // 双与和双或 当一边的表达式足够判断了，则后边的语句就不执行了；
        // 单与 单或 所有语句都会执行
        int v = 10;
        int x = 8;
        System.out.println(10 > v && ++x < 7);
        System.out.println(x);

        System.out.println("__________________三元运算符____________________");
        int score = 90;
        System.out.println(score >= 60 ? "及格" : "挂科");

        System.out.println("_________________________键盘录入__________________________________");
        // 得到键盘扫描对象
        Scanner sc = new Scanner(System.in);
        // 调用sc 对象功能，等待用户输入数据

        System.out.println("请您输入姓名：");
        String name = sc.next();
        System.out.println("输入：" + name);

    }


}
