package com.rrays.dp.singleton1;

public class Emperor {

    public static Emperor emperor= null;//定义一个皇帝放在那里，然后给这个皇帝名字

    private Emperor(){
        ////世俗和道德约束你，目的就是不让你产生第二个皇帝
    }

    public static Emperor getInstance(){
        if(emperor == null){
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo(){
        System.out.println("大家好我是渣渣皇");
    }
}
