package com.rrays.dp.Proxy;

/**
 * 代理模式主要使用了 Java 的多态，干活的是被代理类，代理类主要是
 * 接活，你让我干活，好，我交给幕后的类去干，你满意就成，那怎么知道被代理类能不能干呢？同根就成，
 * 大家知根知底，你能做啥，我能做啥都清楚的很，同一个接口呗。
 *
 */

public class XiMenQing {
    /*
     * 水浒里是这样写的：西门庆被潘金莲用竹竿敲了一下难道，痴迷了，
     * 被王婆看到了, 就开始撮合两人好事，王婆作为潘金莲的代理人
     * 收了不少好处费，那我们假设一下：
     * 如果没有王婆在中间牵线，这两个不要脸的能成吗？难说的很！
     *
     *
     *
     *
     */
    public static void main(String[] args) {
        PanJinLian panJinLian = new PanJinLian();
        //把王婆叫出来
        WangPo wangPo = new WangPo(panJinLian);

        //然后西门庆就说，我要和潘金莲happy，然后王婆就安排了西门庆丢筷子的那出戏:
        wangPo.makeEyesWithMan();  //看到没，虽然表面上时王婆在做，实际上爽的是潘金莲
        wangPo.happyWithMan();

        //改编一下历史，贾氏被西门庆勾走：
        JiaShi jiaShi = new JiaShi();
        WangPo wangPo2 = new WangPo(jiaShi); //让王婆作为贾氏的代理人

        wangPo2.makeEyesWithMan();
        wangPo2.happyWithMan();


    }
}
