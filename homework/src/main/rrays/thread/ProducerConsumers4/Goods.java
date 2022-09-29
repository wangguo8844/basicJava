package main.rrays.thread.ProducerConsumers4;

public class Goods {

    private String brand;
    private String name;
    //默认是不存在商品的，如果为true，代表有商品
    private Boolean flag=false;

    public Goods(String brand, String name) {
        this.brand=brand;
        this.name=name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
