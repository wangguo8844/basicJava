package main.rrays.Collection.set;

import java.util.*;

/**
 * Set接☐
 * 1   Set接口存储一组唯一，无序的对象
 * (存入和取出的顺序不一定一致)
 * 操作数据的方法与list类似，Set接口不存在get()方法
 *
 *
 * 2    set不可以通过下标获得对应的元素值，因为是无序的
 *
 * TreeSet 红黑树,利用treeMap实现
 * ArrayList 数组
 * linkList 链表
 *
 * 3    设置元素的时候，如果是自定义对象，会查找对象中的equals和hashcode的方法，如果没有，比较的是地址
 *
 *      比较器分类
 *      内部比较类 定义元素中通过实现comparable接口进行实现
 *      外部比较类 定义在当前类中，通过实现comparator接口来实现.但是要将该比较器传递到集合中
 *
 *      注意：外部比较器可以定义成·个工其类，此时所有需要比较的规则如果一致可以复用，而内部比较器只有在存储当前对象的时候才可以使用
 *      如果同时存在就使用外部比较器
 *      当使用比较器的时候，不会调用equals方法
 *
 */

public class SetDemo implements Comparator<Person> {
    public static void main(String[] args) {

        Set set = new HashSet();
        set.add("1234");
        set.add(1);
        set.add(true);
        set.add("1234");
//        System.out.println(set);
//
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        //推荐第二种方式 因为 Iterator 是个全局变量 这样在for 中使用完后就关了 ，性能好
//        for (Iterator iterator1 = set.iterator(); iterator1.hasNext();){
//            System.out.println(iterator1.next());
//        }

        Set treeSet = new TreeSet(new SetDemo());
        treeSet.add(new Person("zhangsan","123"));
        treeSet.add(new Person("lisi","234"));
        treeSet.add(new Person("wangwu","345"));

        System.out.println(treeSet);

    }



    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().length()>o2.getName().length()){
            return -1;
        }
        if (o1.getName().length()<o2.getName().length()){
            return 1;
        }
        else {
            return 0;
        }

    }
}
