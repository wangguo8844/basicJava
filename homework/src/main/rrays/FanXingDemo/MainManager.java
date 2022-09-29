package main.rrays.FanXingDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class MainManager {

    public static void main(String[] args) {
        Employee<Employeet> employee= new Employeet(1,"张三",10,"男");
        Employee<Employeet> employee1= new Employeet(2,"李四",11,"男");
        Employee<Employeet> employee2= new Employeet(3,"王五",12,"男");
        Employee<Employeet> employee3= new Employeet(4,"赵六",13,"男");


        Employee<Programmer> p = new Programmer(5,"李四",21,"男",20);
        Employee<Programmer> p1= new Programmer(6,"李四",22,"男",20);
        Employee<Programmer> p2 = new Programmer(7,"李四",23,"男",23);
        Employee<Programmer> p3 = new Programmer(8,"李四",24,"男",20);

        Employee<Manager> m = new Manager(5,"李四",21,"男",2);
        Employee<Manager> m1 = new Manager(5,"李四",21,"男",5);
        Employee<Manager> m2 = new Manager(5,"李四",21,"男",8);
        Employee<Manager> m3 = new Manager(5,"李四",21,"男",10);

        List<Employee> list =new ArrayList();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);


        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.add(p);
        linkedList.add(p1);
        linkedList.add(p2);
        linkedList.add(p3);
        System.out.println(linkedList);

        HashSet<Employee> hashSet = new HashSet<>();
        hashSet.add(m);
        hashSet.add(m1);
        hashSet.add(m2);
        hashSet.add(m3);
        hashSet.remove(m2);
        System.out.println(hashSet);



    }
}
