package main.rrays.lambda.why;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",24,67));
        list.add(new Student("lisi",25,86));
        list.add(new Student("wangwu",26,98));
        list.add(new Student("mali",27,79));
        list.add(new Student("yang",28,67));

        findByAge(list);
        findByScore(list);

    }

    public static void findByAge(ArrayList<Student> students) {
        ArrayList<Student> stu = new ArrayList<>();
        for (Student student:students){
            if (student.getAge() >14) {
                stu.add(student);
            }
        }
        for (Student student:stu){
            System.out.println(student);
        }
    }

    public static void findByScore(ArrayList<Student> students) {
        ArrayList<Student> stu = new ArrayList<>();
        for (Student student: students){
            if (student.getScore()>75){
                stu.add(student);
            }
        }
        for (Student student:stu){
            System.out.println(student);
        }
    }

}
