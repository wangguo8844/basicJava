package main.rrays.lambda.why3;

import main.rrays.lambda.why.Student;
import main.rrays.lambda.why2.StudentFiler;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",24,67));
        list.add(new Student("lisi",25,86));
        list.add(new Student("wangwu",26,98));
        list.add(new Student("mali",27,79));
        list.add(new Student("yang",28,67));


        getByFilter(list, new StudentFiler() {
            @Override
            public boolean compare(Student student) {
                return student.getAge()>15;
            }
        });
        System.out.println("----------------------");
        getByFilter(list, new StudentFiler() {
            @Override
            public boolean compare(Student student) {
                return student.getScore()>96;
            }
        });
    }

    public static void getByFilter(ArrayList<Student> students,StudentFiler studentFilter){
        ArrayList<Student> list = new ArrayList<>();
        for(Student student:students){
            if (studentFilter.compare(student)){
                list.add(student);
            }
        }
        printStudent(list);

    }

    public static void printStudent(ArrayList<Student> students){
        for(Student student:students){
            System.out.println(student);
        }
    }



}
