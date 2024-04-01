package com.itheima.operator;
/*
* for 循环格式
*
* */
public class OperatorFor {
    public static void main(String[] args) {
        // 输出三次hello
        for (int i = 0; i < 3; ++i) {
            System.out.println("hello world!!!");
        }
        // 求和 1 - 5 的和
        int num = 0;
        for (int i = 0; i <= 5; i++) {
            num += i;
        }
        System.out.println(num);

        // 求奇数和
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);

        // 求水仙花数 水仙花数是个三位数； 个位、十位、百位的数字立方和等于原数

        for (int i = 100; i <=999 ; i++) {
            // 个位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if((ge*ge*ge + shi*shi*shi + bai*bai*bai) == i) {
                System.out.println("此数是水仙花数： " + i + '\n');
            }
        }

    }
}
