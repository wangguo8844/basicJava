package main.rrays.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection 存放的是单一值
 *  特点：
 *  1、可以存放不同类型的数据，而数组只能存放固定类型的数据
 *  2、
 *api 方法必须是object ,因此写入基本类型的时候，包含自动的拆箱和装箱
 *
 */
public class CollectionDemo {
    public static void main(String[] args) {

        Collection collection = new ArrayList();
        collection.add(new Integer(1));
        collection.add(true);
        collection.add(1.23);
        collection.add("str");
    }
}
