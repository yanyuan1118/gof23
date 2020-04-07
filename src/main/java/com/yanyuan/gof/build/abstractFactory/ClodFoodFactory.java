package com.yanyuan.gof.build.abstractFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description TODO
 * @Author yanyuan
 * @Date 19:40 2020/4/5
 * @Version 1.0
 **/
@Slf4j
public class ClodFoodFactory implements FactoryInterface {
    public Pizza createPizza(String type) {
        log.info("createPizza");
        if("VEGG".equals(type)){
            PizzaVegg pizzaVegg = new PizzaVegg();
            pizzaVegg.prepare();
            pizzaVegg.complete();
            return pizzaVegg;
        }
        return null;
    }

    public Milk createMilk(String type) {
        log.info("createMilk");
        if("APPLE".equals(type)){
            MilkApple milkApple = new MilkApple();
            milkApple.prepare();
            milkApple.complete();
            return milkApple;
        }
        return null;
    }
}
