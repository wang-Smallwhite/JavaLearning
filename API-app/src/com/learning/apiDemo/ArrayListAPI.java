package com.learning.apiDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAPI {
    public static void main(String[] args) {
        // 创建 ArrayList 对象
//        ArrayList list = new ArrayList();
//
//        list.add("java");
//        list.add(1, "js");
//        System.out.println(list);


        // 集合对于 泛型的支持 规范集合的类型
        ArrayList<String> l = new ArrayList<>();
        l.add("js");
        l.add("css");
        l.add("html");
        l.add("java");
        l.add("spring");
        System.out.println(l);
        ArrayList<Integer> i = new ArrayList<>();
        i.add(123);
        System.out.println(i);
        commonApi(l);
        listDel();
        customList();
        studentTest();
    }
//    常用 API
    public static void commonApi(ArrayList<String> l) {
        System.out.println("====================================================");
        /*
         * 返回制定索引处的元素  get()
         * */
        System.out.println("返回制定索引处的元素：" + l.get(0));
        /*
         * 修改某个索引位置的元素
         * */
        System.out.println("修改某个索引位置的元素：" + l.set(2, "vue"));
        System.out.println(l);

        /*
         * 返回集合长度 size（）
         * */
        System.out.println("返回集合长度：" + l.size());


        /*
         * 删除某个索引位置的元素值，并返回被删除的元素值 remove（int index）
         * */
        System.out.println("删除某个索引位置的元素值，并返回被删除的元素值：" + l.remove(2));
        System.out.println(l);

        /*
         * 直接删除索引值 remove（Object o）  只会删除第一次出现的
         * */
        System.out.println(l.remove("java"));
        System.out.println(l);
    }


    /*
    * 删除低于 80 分 的 集合内容
    * */
    public static void listDel() {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(90);
        scores.add(80);
        scores.add(70);
        scores.add(66);
        scores.add(92);
        scores.add(65);
        scores.add(78);
        scores.add(81);
        // bug 方案
//        for (int i = 0; i < scores.size(); i++) {
//            int score = scores.get(i);
//            if(score < 80) {
//                scores.remove(i);
//            }
//        }
        // 被删除元素后，集合中的下一个元素会向前提，数据 i 值 ++ 会漏掉元素
        System.out.println(scores);  // [90, 80, 66, 92, 78, 81]

        // 解决方案 一
//        for (int i = 0; i < scores.size(); i++) {
//            int score = scores.get(i);
//            if(score < 80) {
//                scores.remove(i);
//                i--;
//            }
//
//        }
//        System.out.println(scores);   // [90, 80, 92, 81]

        // 解决方案 二  倒着判断计算
        for (int i = scores.size() - 1; i >= 0 ; i--) {
            int score = scores.get(i);
            if(score < 80) {
                scores.remove(i);
            }
        }
        System.out.println(scores);  // [90, 80, 92, 81]
    }

    // 存储自定义类型
    public static void customList() {
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("肖申克的救赎", 9.8, "罗宾斯"));
        movies.add(new Movie("霸王别姬", 9.8, "张国荣，张丰毅"));
        movies.add(new Movie("阿甘正传", 9.8, "汤姆·汉克斯"));

        System.out.println(movies);  //  [com.learning.apiDemo.Movie@5acf9800, com.learning.apiDemo.Movie@4617c264, com.learning.apiDemo.Movie@36baf30c]

        for (Movie m : movies) {
            System.out.println(m.getName());
            System.out.println(m.getScore());
            System.out.println(m.getActor());
        }
    }


    // 案例 学生信息系统，展示数据，并按照学号完成搜索
    public static void studentTest() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("20180302", "叶孤城", 23, "护理一班"));
        students.add(new Student("20180303", "东方不败", 22, "推拿一班"));
        students.add(new Student("20180304", "西门吹雪", 21, "洗头一班"));
        students.add(new Student("20180305", "梅超风", 20, "刮脸一班"));
        while (true) {
            System.out.println("=============================学生系统=====================================");
            System.out.println("学号\t\t\t\t\t姓名\t\t\t\t\t年龄\t\t\t\t\t\t班级");
            for(Student student : students) {
                System.out.print(student.getStudyId() + "\t\t\t");
                System.out.print(student.getName() + "\t\t\t\t");
                System.out.print(student.getAge() + "\t\t\t\t\t ");
                System.out.println(student.getClassName());
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学号查询学生相关信息：");
            String studyId = sc.next();
            Student st = getStudentByStudyId(students,studyId);
            if(st != null) {
                System.out.println("学号\t\t\t\t\t姓名\t\t\t\t\t年龄\t\t\t\t\t\t班级");
                System.out.print(st.getStudyId() + "\t\t\t");
                System.out.print(st.getName() + "\t\t\t\t");
                System.out.print(st.getAge() + "\t\t\t\t\t ");
                System.out.println(st.getClassName());
            }else {
                System.out.println("未查到相关学生信息！！！");
            }
        }
    }
    public static Student getStudentByStudyId(ArrayList<Student> students, String studyId) {
        for(Student student : students) {
            if(student.getStudyId().equals(studyId)) {
                return student;
            }
        }
        return null;
    }
}
