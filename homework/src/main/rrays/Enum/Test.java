package main.rrays.Enum;

/**
 * 为什么使用枚举
 *不用每次写字符串，还往里面添加属性，直接确定统一的类型，等于一个常量值，每次用的固定的值而已。
 * 每个值只存在一次，而不会出现多次创建的情况
 * 强烈健议当你需要定义一组常量时，使用枚举类型
 */
public class Test {

    public static void main(String[] args) {
        EventEnum.LAUNCH.show();
        System.out.println("---------");
        String name = EventEnum.PAGEVIEW.name();
        System.out.println(name);
    }

}
