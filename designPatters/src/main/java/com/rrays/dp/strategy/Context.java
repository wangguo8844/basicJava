package com.rrays.dp.strategy;

/**
 * I'm glad to share my knowledge with you all.
 * 计谋有了，那还要有锦囊
 *
 *高内聚低耦合的特点也表现出来了，
 *还有一个就是扩展性，也就是 OCP 原则，策略类可以继续增加下去，只要修改 Context.java 就可以了
 *
 * 在面向对象领域，有一个很著名的原则：OCP(Open-Closed Principle),它的核
 * 心含意是：一个好的设计应该能够容纳新的功能需求的增加，但是增加的方式不是通过
 * 修改又有的模块（类），而是通过增加新的模块（类）来完成的，也就是在设计的时候，所
 * 有软件组成实体包括接口，函数，函数等必须是可扩展但不可修改的。如果一个设计能够
 * 遵循OCP那么就能够有效的避免上述的问题。
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy){
        this.strategy=strategy;
    }

    public void operate(){
        this.strategy.operate();
    }
}
