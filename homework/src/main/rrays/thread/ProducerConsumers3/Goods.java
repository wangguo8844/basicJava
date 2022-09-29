package main.rrays.thread.ProducerConsumers3;

public class Goods {

    private String brand;
    private String name;
    //默认是不存在商品的，如果为true，代表有商品
    private Boolean flag=false;

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


    //生产者生产商品
    public synchronized void set(String brand, String name){
        //当生产者抢占到cpu资源之后会判撕断当前对象是否有值，如果有的活，意味着消费者还没有消费，需要提醒消费者消费，同时
        //当前线程进入阻塞状态，等待消费者取走商品之后，再次生产
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生成了"+this.getBrand()+"--"+this.getName());
        //如果代码执行到此处，意味着已经生产完成，需要将flag设置true
        flag=true;
        //唤醒消费者去消费
        notify();
    }

    //消费者获取商品
    public synchronized void get(){
        /*
        如果flag等于false.的话，意味着生产者没有生产商品.此时消费者无法消费，需要让消费者线程进入到阻塞状态，等待生产者生产，当有商品之后，再开始消费

         */
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者消费了"+this.getBrand()+"--"+this.getName());
        flag=false;
        //唤醒生产者去进行生产
        notify();


    }

}
