package main.rrays.Reflect.ReflectTest03;

//子类
@MyAnnotation(value ="hello")
public class Student extends Person implements MyInterface{
    //属性
    private int sno;//学号
    double height;
    protected double weight;//体重
    public double score;//成绩

    //方法
    @MyAnnotation(value = "helloMethod")
    public String showInfo(){
        return "我是一名三好学生";
    }
    //重载方法
    public String showInfo(int a, int b){
        return "重载方法我是一名三好学生";
    }
    private void work(int a){
        System.out.println("我要努力工作");
    }
    void happy(){
        System.out.println("工作使我快乐");
    }
    protected int getSno() {
        return  sno;
    }
    //构造器
    public Student(){
        System.out.println("空参构造器");
    }
    public Student(double weight,double height){
        this.weight = weight;
        this.height = height;
    }
    private Student(int sno){
        this.sno= sno;
    }
    Student(int sno,double weight){
        this.sno = sno;
        this.weight = weight;
    }
    protected  Student(int sno,double height,double weight){
        this.sno=sno;
    }

    @Override
    @MyAnnotation(value = "helloMyOverride")
    public void myMethod() throws RuntimeException{
        System.out.println("重写myMethod");
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", height=" + height +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }
}
