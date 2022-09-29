package main.rrays.FanXingDemo;

public class FanXIngClass <A>{

    private int id;
    private A a;

    public FanXIngClass(int id, A a) {
        this.id = id;
        this.a = a;
    }

    public FanXIngClass() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void show() {
        System.out.println("id   "+id+"A   " +a);
    }
}
