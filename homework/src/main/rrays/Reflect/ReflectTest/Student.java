package main.rrays.Reflect.ReflectTest;
//子类
public class Student extends Person{
    //属性
    private int sno;//学号
    double height;
    protected double weight;//体重
    public double score;//成绩

    //方法
    public String showInfo(){
        return "我是一名三好学生";
    }
    private void work(){
        System.out.println("我要努力工作");
    }
    //构造器
    public Student(){
        System.out.println("空参构造器");
    }
    private Student(int sno){
        this.sno= sno;
    }
    Student(int sno,double weight){
        this.sno = sno;
        this.weight = weight;
    }
}
