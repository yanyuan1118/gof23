package com.yanyuan.gof.behavior.command;

/**
 * @Description Command 抽象命令类
 * @Author yanyuan
 * @Date 11:56 2020/4/11
 * @Version 1.0
 **/
public abstract class Command {

    /**
     * 为什么使用抽象类？
     *
     * 1.interface里面加入变量，是不符合开发要求的，我们的interface只允许存在抽象的公开方法
     * 所以当我们在interface里面加入成员变量或对象变量时，虽然不报错，但不符合开发思想
     *
     * 2.此时我们应该考虑使用Abstract抽象类, 它允许我们加入成员变量，允许构造函数, 允许非抽象方法
     *
     * 3. static关键字开辟了静态存储空间
     *
     * 4、final关键字
     * final关键字的思想，来源于我们的单例模式思想
     */

    //需要加载接收者类，将receiver加载
    final static Receiver receiver = new Receiver();


    /**
     * 为什么在父类定义记忆变量
     */
    int memoryValue;

    public abstract int execute(int value);

    //撤销操作
    public abstract int reset();
}
