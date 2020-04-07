package com.yanyuan.gof.build.factory;

/**
 * @Description test class
 * @Author yanyuan
 * @Date 12:11 2020/4/5
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args){
        PizzaStoreChangsha pizzaStoreChangsha = new PizzaStoreChangsha();
        pizzaStoreChangsha.orderPizza("VEGG");

        pizzaStoreChangsha.orderPizzaClod("VEGG");
    }
}
