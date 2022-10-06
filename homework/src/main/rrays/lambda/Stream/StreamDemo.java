package main.rrays.lambda.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    //通过数组来生成
    static void gen1() {
        String[] strs = {"a","b","c","d","e"};
        Stream<String> strs1 = Stream.of(strs);
        strs1.forEach(System.out::println);

//        等于
//        for(String str: strs) {
//            System.out.println(str);
//        }
    }

    //通过集合来合成
    static void gen2() {
        List<String> list = Arrays.asList("1","2","3","4");
        Stream<String> stream= list.stream();
        stream.forEach(System.out::println);
    }

    //generate
    static void gen3() {
        Stream<Integer> generate = Stream.generate(() -> 2);
        generate.limit(10).forEach(System.out::println);
    }

    //使用iterator
    static void gen4() {
        Stream<Integer> iterate = Stream.iterate(1,e -> e+1);
        iterate.limit(10).forEach(System.out::println);
    }

    //其他方式
    static void gen5() {
        String str = "abcdefg";
        IntStream stream = str.chars();
        stream.forEach(System.out::println);
    }
    public static void main(String[] args) {
        //stream 生成操作
        //  gen1();
        // gen2();
//        gen3();
//        gen4();
//        gen5();

        //中间操作:如果调用方法之后返回结果是Stream对象就是意味是一个中间操作
        Arrays.asList(1,2,3,4,5).stream().filter((x)->x%2 == 0).forEach(System.out::println);
        System.out.println("____________________________________");
        //求结果集中所有偶数的和
        int sum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream().filter((x) -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(sum);
        System.out.println("____________________________________");
        //求集合的最大值
        List<Integer> list = Arrays.asList(1,2,3,4,9,5,8);
        Optional<Integer> max = list.stream().max((a, b) -> a - b);
        System.out.println(max.get());

        //求集合的最小值
        Optional<Integer> min = list.stream().min((a, b) -> a - b);
        System.out.println(min.get());
        System.out.println("____________________________________");
        //输出一个
        Optional<Integer> any = list.stream().filter((x) -> x % 2 == 0).findAny();
        //全部输出
        System.out.println(list.stream().filter((x) -> x % 2 == 0).collect(Collectors.toList()));
        System.out.println(any);
        Optional<Integer> first = list.stream().filter((x) -> x % 2 == 0).findFirst();
        System.out.println(first);
        System.out.println("____________________________________");
        Stream<Integer> integerStream = list.stream().filter((i)->{
            System.out.println("运行代码"); //此行不会打印
            return i % 2 ==0;
        });
        System.out.println(integerStream.findAny().get());
        System.out.println("____________________________________");
        //获取最大值和最小值但是不使用min和max方法
        System.out.println(list.stream().sorted().findFirst().get());
        System.out.println(list.stream().sorted((a, b) -> b - a).findFirst());
        System.out.println("____________________________________");
        System.out.println("collectcollectcollect");
        //如果要输出一串数
        List<Integer> collect = list.stream().filter((x) -> x % 2 == 0).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("____________________________________");
        //去重操作
        Arrays.asList(1,2,3,4,5,5,3,1).stream().distinct().forEach(System.out::println);

        Arrays.asList(1,2,3,4,5,5,3,1).stream().collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("____________________________________");
        //打印20-30的集合数据
        Stream.iterate(1,x->x+1).limit(30).skip(20).forEach(System.out::println);
        System.out.println("____________________________________");
        String str = "11,22,33,44,55";
        System.out.println(Stream.of(str.split(",")).mapToInt(x -> Integer.valueOf(x)).sum());
        System.out.println(Stream.of(str.split(",")).mapToInt(Integer::valueOf).sum());
        //等于
        System.out.println("等于");
        System.out.println(Stream.of(str.split(",")).map(x -> Integer.valueOf(x)).mapToInt(x -> x).sum());
        System.out.println(Stream.of(str.split(",")).map(Integer::valueOf).mapToInt(x -> x).sum());
        System.out.println("____________________________________");
        //将str种 每个数值都打印出来，同时算出最终的求和结果
        System.out.println(Stream.of(str.split(",")).peek(System.out::println).mapToInt(Integer::valueOf).sum());
        System.out.println(list.stream().allMatch(x -> x >= 0));
        //创建一组自定义对象
        String str2 = "java,scala,python";
        Stream.of(str2.split(",")).map(x->new Person(x)).forEach(System.out::println);
        System.out.println("------------------------------d");
        Stream.of(str2.split(",")).map(Person::new).forEach(System.out::println);
        System.out.println("------------------------------d");
        Stream.of(str2.split(",")).map(Person::building).forEach(System.out::println);
        System.out.println("------------------------------d");

        System.out.println("------------------------------d");


    }
}
