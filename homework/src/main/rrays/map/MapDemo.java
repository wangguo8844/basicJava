package main.rrays.map;

import java.util.*;

/**
 *
 * map 存储的是k-v键值对
 *
 * 实现子类：
 *      HashMap
 *      LinkedHashMap: 链表
 *      TreeMap 红黑树
 *
 * 基本api操作:
 *      增加put
 *      查找containsKey  containsValue get  isEmpty size
 *      删除:
 *              clear 清空集合中的所有元素
 *              remove 删除指定元素
 *Map.entry  表示的是K-V组合的一组映射关系，key 和value成组出现
 *
 *      hashmap跟hashtable的区别
 *      1hashmap 线程不安全 效率高，hashtable相反
 *      2hashmap 中 key,value 可以为空，hashtable 不允许为空
 *
 */

public class MapDemo {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);


        Set<String> keys = map.keySet();
        for (String key:keys) {
            System.out.println(key + "=" +map.get(key));
        }

        Collection<Integer> values = map.values();
        for (Integer i : values) {
            System.out.println(i);
        }

        Set<String> key2 = map.keySet();
        Iterator<String> iterator = key2.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key+ "=" + map.get(key));
        }

        //Map.entry
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Integer> next = iterator1.next();
            System.out.println(next.getKey()+"----"+next.getValue());
        }
    }
}
