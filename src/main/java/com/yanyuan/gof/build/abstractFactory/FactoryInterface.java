package com.yanyuan.gof.build.abstractFactory;


/**
 * @Description TODO
 * @Author yanyuan
 * @Date 19:28 2020/4/5
 * @Version 1.0
 **/
public interface FactoryInterface {

    Pizza createPizza(String type);

    Milk createMilk(String type);
}
