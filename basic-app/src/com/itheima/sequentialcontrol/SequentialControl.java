package com.itheima.sequentialcontrol;
/*
* 流程控制
*
* */
import java.util.Scanner;

public class SequentialControl {
    public static void main(String[] args) {
        // if 分支结构
        // 需求： 心跳（60 - 100）之间是正常的，否则提示进一步检查
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入心跳值：");
//        int heartBeat = sc.nextInt();
//        if(heartBeat >= 60 && heartBeat<=80) {
//            System.out.println("正常");
//        }else {
//            System.out.println("需要进一步检测");
//        }

        // 绩效统计 0-60 C、60-80 B、80-100 A；
        System.out.println("请输入成绩：");
        int score = sc.nextInt();
        if(score >= 0 && score <= 60) {
            System.out.println("C");
        }else if(score > 60 && score <= 80) {
            System.out.println("B");
        }else if(score > 80 && score <= 100) {
            System.out.println("A");
        }else {
            System.out.println("录入的成绩不在判定范围内");
        }

        // 通过 switch 进行值匹配
        /*
        * ⚠️ 表达式 case 只支持 byte、short、int、char、String
        * ⚠️ 一定要 break 否则会穿透
        * ⚠️ case 值一定是字面量，不允许是变量
        *
        * */
        switch (score) {
            case 60:
                System.out.println("C");
                break;
            case 80:
                System.out.println("B");
                break;
            case 90:
                System.out.println("A");
                break;
            default:
                System.out.println("录入的成绩不在判定范围内");

        }

//       switch 巧用值穿透
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月份是31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "月份是30天");
            case 2:
                System.out.println("month" + "月份，闰年是29天；非闰年28天。");
            default:
                System.out.println("请输入正确的月份！！！80");
        }


    }
}
