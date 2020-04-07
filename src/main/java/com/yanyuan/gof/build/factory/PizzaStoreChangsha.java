package com.yanyuan.gof.build.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 长沙披萨分店
 * @Author yanyuan
 * @Date 12:02 2020/4/5
 * @Version 1.0
 **/
@Slf4j
public class PizzaStoreChangsha implements Factory{

    public void orderPizza(String type){
        log.info("【长沙披萨分店】客户预定pizza 类型{}", type);
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.make();
        pizza.complete();
        log.info("【长沙披萨分店】完成pizza制作");
    }

    public void orderPizzaClod(String type){
        log.info("【长沙披萨分店】客户预定pizza clod类型{}", type);
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.complete();
        log.info("【长沙披萨分店】完成pizza clod ");
    }

    public Pizza createPizza(String type) {
        log.info("createPizza");
        if("VEGG".equals(type)){
            return new PizzaVegg();
        }
        return null;
    }

    public Milk createMilk(String type) {
        return null;
    }

    public Pizza createPizzaClod(String type) {
        log.info("createPizza");
        if("VEGG".equals(type)){
            return new PizzaVegg();
        }
        return null;
    }
}
