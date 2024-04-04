package com.learning.apiDemo;

import java.util.Arrays;
import java.util.Scanner;

public class StringApi {
    public static void main(String[] args) {
        // String 是不可变的字符串
        // String 变量每次的修改其实都是产生并指向了新的字符串对象，原字符串对象没有改变，所以是不可变字符串

        // 创建字符串对象
        // 方式一
        String name = "12345";
        // 方式二
        String product = new String("pro");
        System.out.println(product);

        // 方式三 public String(char[] c) 根据字符数组的内容，来创建字符串
        char[] str = {'a', 'b', 'c'};
        String str1 = new String(str);
        System.out.println(str1);

        // 方式四 public String(byte[] b) 根据字节数组内容，来创建字符串
        byte[] bts = {97, 99, 100, 104, 10};
        String btstr = new String(bts);
        System.out.println(btstr);


        /*
        * 以 “” 方式给出的字符串对象，在字符串常量池中存储， 而且相同的内容只会在其中存储一份
        *
        * new String(), 相同的是false
        * */
//        String name1 = "阿巴阿巴";
//        System.out.println(name1 == name);
//        String str2 = new String(str);
//        System.out.println(str1 == str2);
//
//        String s1 = "abc";
//        String s2 = "ab";
//        String s3 = s2 + "c";
//        System.out.println(s1 == s3); // false
//        String s4 = "a" + "b" + "c";
//        System.out.println(s1 == s4); // true



        // String  内容比较
        // equals 会区分大小写 是 精确比较
        // equalsIgnoreCase 不区分大小写
        // 正确的登录名和密码
//        String okName = "shiQi";
//        String okPassword = "123456";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入登录名称");
//        String user = sc.next();
//        System.out.println("请输入登录密码");
//        String password = sc.next();
//
//        if(okName.equals(user) && okPassword.equals(password)) {
//            System.out.println("登录成功");
//        }else {
//            System.out.println("登录失败");
//        }




        /*
        * 获取字符串长度
        * */
        int len = name.length();
        System.out.println("获取字符串长度length：" + len);


        /*
        * 获取某个索引位置处的字符  charAt()
        * */
        System.out.println("获取某个索引位置处的字符: "+ name.charAt(2));

        /*
        * 把字符串转换成字符数组   toCharArray()
        * */
        System.out.println("把字符串转换成字符数组: "+ Arrays.toString(name.toCharArray()));


        /*
        * 截取字符串 substring（）
        * */
        System.out.println("截取字符串: " + name.substring(2));


        /*
        * 替换方法 replace()
        * */
        System.out.println("替换方法: " + name.replace("12", "89"));

        /*
        * 字符串中是否包含 contains
        * */
        System.out.println("字符串中是否包含: " + name.contains("82"));

        /*
        * 判断字符串中是否以某些字符开头   startsWith()
        * */
        System.out.println("判断字符串中是否以某些字符开头: " + name.startsWith("12"));

        /*
        * 字符串分割成数组 split（）
        * */
        System.out.println("字符串分割成数组: " + Arrays.toString(name.split("")));
    }
}
