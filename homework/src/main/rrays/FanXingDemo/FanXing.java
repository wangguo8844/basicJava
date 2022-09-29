package main.rrays.FanXingDemo;

import main.rrays.Collection.set.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 保证集合的类型是统一的，此处需要泛型来进行限制
 *  优点
 *          1.数据安全
 *          2.获取数据事效率比较高
 *          给集合中的元素设置相同的类型就是泛型的基本需求
 *          使用：
 *          在定义对象的时候，通过<>中设置合理的类型进行实现
 *
 * 泛型的高阶应用：
 *      1泛型类  在定义类名的时候，可以在类后加<>，
 *      2泛型接口：   在定义接口的时候，在接口的名称后添加<E,A.B,V>
 *                  1子类在进行实现的时候，可以不填写泛型的的类型，此时在创建具体的子类对象的时候才决定类型
 *                  2、子类在实现泛型接口的时候，只在实现父类的接口的时候指定父类的泛型类型即可
 *      3泛型方法
 *
 *      4泛型的上限
 *      5泛型的下限
 */

public class FanXing {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<String>();
//        list.add("1");  //new Integer(1)
//        list.add("abc");  //new String("abc")
//        list.add("true");     //new Boolean(true)
//        list.add(new Person("zhangsan","12").toString());
//        System.out.println(list);

        FanXIngClass<String> fxc = new FanXIngClass<>();
        fxc.setA("rrays");
        fxc.setId(1);
        fxc.show();

        FanXIngClass<Integer> fxc2 =new FanXIngClass<>();
        fxc2.setA(123);
        fxc2.setId(1);
        fxc2.show();







    }
}
