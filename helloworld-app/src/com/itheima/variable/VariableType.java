package com.itheima.variable;
/*
* 基本数据类型
*
* */
public class VariableType {
    public static void main(String[] args) {
        // byte 字节型 占 1 个字节 -128 ～ 127
        byte num = 98;
        // short 短整型 占 2 个字节
        short number = 30000;

        // int 整型 占 4 个 字节
        int it= 9302932;

        // long 长整型 占 8 个字节  ⚠️如果写的整数当成long类型 需要在其后 加 L
        long lg = 133928239;
        long lg1 = 99392398191310233L;

        // 浮点数（小数）
//        float 单精度 占 4个 字节  ⚠️如果希望写的小数是float 类型 需要在其后面加 F / f
        float score = 98.5F;

//        double 双精度浮点数 占 8 个字节
        double d = 89.99;

        // 字符型 char 有且只有一个字符
        char ch = '1';
//        char ch1 = 'aa';

        // boolean
        boolean rs = true;
    }
}
