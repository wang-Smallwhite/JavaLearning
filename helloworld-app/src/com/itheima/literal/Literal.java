package com.itheima.literal;
/*
* 字面量*/
public class Literal {
    public static void main(String[] args) {
        // 整数
        System.out.println(111);
        // 小数
        System.out.println(99.5);

        // 字符： 必须使用单引号围起来， 有且只有一个字符
        System.out.println('0');
        System.out.println('a');
//        System.out.println('');  会出问题报错
        System.out.println(' ');
        // 特俗字符： \n 代表换行 ; \t 代表 tab

        // 字符串： 必须使用双引号围起来， 里面的内容可以随意
        System.out.println("sjsjdh10d\ndjksal");

        // 布尔值
        System.out.println(true);
        System.out.println(false);
    }
}
