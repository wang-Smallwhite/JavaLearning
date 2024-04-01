package com.itheima.variable;

/*
 * 变量
 * */
public class VariableDemo1 {
    public static void main(String[] args) {
        // 数据类型 变量名 = 初始值；
        double money = 6.82;
        System.out.println(money);

        // 修改变量 方法一
        money = money + 9;
        System.out.println(money);
        System.out.println("----------------------------------------------------");
        // 修改变量 方法二
        int age = 21;
        System.out.println("age: " + age);
        age = 89;
        System.out.println("new Age: " + age);

        System.out.println("----------------------------注意事项----------------------");
        // 变量需要先声明
        int a = 123;
        // 变量声明后， 不能存储其他类型数据
//        a = 1.5

//      // 变量的有效范围是从定义开始到 “}” 截止； 且同一个范围内部不能定义两个同名的变量；
        {
            int b = 123;
            System.out.println(a);
        }
        int b = 90;

        // 变量使用可以无初始值， 但是使用的时候必须有初始值
        int c;
//        c= c + 1;


        char ch = 'a';
        System.out.println(ch);
        // 等于98 ， 标识 a 的 ASCII 编码 97
        System.out.println(ch + 1);


        // 二进制 0b 0B
        int i1 = 0b10100011;
        System.out.println(i1);
        // 八进制 0
        int i2 = 02737;
        System.out.println(i2);
        // 十六进制 0X 0x
        int i3 = 0x1af89011;
        System.out.println(i3);

    }

}
