package main.rrays.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *所有集合类都默认实现了Iterable 的接口 实现此接口意味着具备了增强for -each
 *
 *      增强for循环本质上使用的也是iterator的功能
 * 方法：
 * iterator()
 * foreach()
 *在iterator的方法中 要求返回一个Iterator的接口子类实例对象
 *  此接口中包含了
 *  hasNext()
 *  next()
 *
 *
 * 在使用Iterator进行迭代的过程中如果删除其中的某个元素会报错，并发异常，因此
 *          如果遍历的同时需要修改元素，建议使用listIterator(),
 * ListIterator迭代器提供了向前向后的两种遍历
 *          始终是通过cursor 和lastret 指针来获取元素值及向下的遍历索引
 *
 */
public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("--------------");
        //迭代器
//        Iterator iterator = list.iterator();
        ListIterator iterator = list.listIterator();
        while(iterator.hasNext()) {
            Object o = iterator.next();
            if (o.equals(1)) {
                iterator.remove();
            }
            System.out.println(o);
        }

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println("-----------");
        //foreach
        for (Object i : list) {
            System.out.println(i);
        }
    }
}
