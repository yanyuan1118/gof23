package com.yanyuan.gof.build.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 上海披萨分店
 * @Author yanyuan
 * @Date 12:02 2020/4/5
 * @Version 1.0
 **/
@Slf4j
public class PizzaStoreShanghai implements Factory{


    public Pizza createPizza(String type) {
        log.info("【上海披萨分店】客户预定pizza 类型{}", type);
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.make();
        pizza.complete();
        log.info("【上海披萨分店】完成pizza制作");
        return null;
    }

    public Milk createMilk(String type) {
        return null;
    }

    public Pizza createPizzaClod(String type) {
        return null;
    }

    public void orderPizza(String type) {

    }
}
