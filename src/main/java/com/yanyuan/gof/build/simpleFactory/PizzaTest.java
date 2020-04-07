package com.yanyuan.gof.build.simpleFactory;

/**
 * @Description 测试类
 * @Author yanyuan
 * @Date 17:46 2020/4/4
 * @Version 1.0
 **/
public class PizzaTest {
    public static void main(String[] args){
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("MEET");
    }
}
