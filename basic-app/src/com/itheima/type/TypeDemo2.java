package com.itheima.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        /*表达式的自动类型转换
        小范围类型的变量会自动转换较大范围的再计算 转换顺序
        byte short char int long float double
        表达式的最终结果类型由表达式中的最高数据类型决定（占字节位）
        表达式中， byte、 short、char 是直接转换 int 类型参与运算的

        */
        byte a = 10;
        int b = 20;
        double c = 1.0;
        double rs = a + b + c;

        /*
        * 强制类型转换
        * 数据类型 变量2 = （数据类型）变量 || 表达式
        *
        * ⚠️ 强制类型转换可能造成数据（丢失）溢出；
        * ⚠️ 浮点型强转成整型， 直接丢掉小数部分，返回整数部分；
        * */

        int i = 20;
        byte bt = (byte) i;
        System.out.println("byte: " + bt);
        double ft = 20.9;
        int y = (int) ft;
        System.out.println(y);

    }
}
