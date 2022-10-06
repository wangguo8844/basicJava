package main.rrays.lambda.why2;

import main.rrays.lambda.why.Student;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",24,67));
        list.add(new Student("lisi",25,86));
        list.add(new Student("wangwu",26,98));
        list.add(new Student("mali",27,79));
        list.add(new Student("yang",28,67));


        getFiler(list,new AgeFiler());
        System.out.println("---------------");
        getFiler(list,new ScoreFiler());

    }

    public static void getFiler(ArrayList<Student> students, StudentFiler studentFiler) {
        ArrayList<Student> list = new ArrayList<>();
        for (Student student:students){
            if (studentFiler.compare(student)) {
                list.add(student);
            }
        }
        printStudent(list);


    }

    public static void printStudent(ArrayList<Student> students){
        System.out.println(students);
    }
}
