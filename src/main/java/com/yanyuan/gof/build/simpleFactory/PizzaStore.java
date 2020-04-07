package com.yanyuan.gof.build.simpleFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 核心类，消费pizza
 * @Author yanyuan
 * @Date 17:40 2020/4/4
 * @Version 1.0
 **/
@Slf4j
public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public void orderPizza(String type){
        log.info("客户预定pizza 类型{}", type);
        Pizza pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.make();
        pizza.complete();
        log.info("完成pizza制作");
    }
}
