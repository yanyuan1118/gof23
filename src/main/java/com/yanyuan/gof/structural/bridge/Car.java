package com.yanyuan.gof.structural.bridge;

/**
 * @Description 汽车 (abstraction)
 *  桥接模式最终目的就是为了建立一个抽象类的对象
 * @Author yanyuan
 * @Date 09:45 2020/4/8
 * @Version 1.0
 **/
public abstract class Car {

    /**
     * 关联关系，抽象类使用接口实现类通过关联关系进行的，这也是桥接模式的一个重要的特点
     * 关联关系的重要性：
     *      1.关联关系是弱关联（降低耦合度），例如需要增加汽车颜色，只需实现color接口即可，不影响现有代码
     *      2.使用color属性时, 没有通过继承或者实现方式，这是桥接模式特点之一
     *      相比于适配器模式,关联关系的桥接模式更容易达到抽象对象结构建立的目的，而适配器模式通过继承和实现的方式，达到接口兼容的目的
     */
    public Color color;


    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void makeCar(String carType);


    //总结: 结构型模式与建造型模式区别
    //结构型模式是为了更好的组合我们的对象结构，建造型模式负责生产
}
