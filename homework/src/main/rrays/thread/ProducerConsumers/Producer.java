package main.rrays.thread.ProducerConsumers;

/**
 * 生产产品，将产房放置到共享空间中
 *
 */
public class Producer implements Runnable{

    private Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i = 0;i < 10;i++){
            if (i%2==0){
                goods.setBrand("哇哈哈");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.setName("矿泉水");
                System.out.println("生产者生成了"+this.goods.getBrand()+"--"+this.goods.getName());
            }else {
                goods.setBrand("旺仔");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.setName("小馒头");
            }
            System.out.println("消费者消费了"+this.goods.getBrand()+"--"+this.goods.getName());
        }
    }
}
