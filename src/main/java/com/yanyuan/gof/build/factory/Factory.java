package com.yanyuan.gof.build.factory;

/**
 * @Description 面向接口编程
 * @Author yanyuan
 * @Date 11:54 2020/4/5
 * @Version 1.0
 **/
public interface Factory {
    Pizza createPizza(String type);

    /**
     * 方便对比抽象工厂而添加的代码
     * @param type
     * @return
     */
    Milk createMilk(String type);

    /**
     * 方便对比抽象工厂而添加的代码
     * @param type
     * @return
     */
    Pizza createPizzaClod(String type);

}
