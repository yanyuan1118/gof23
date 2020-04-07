package com.yanyuan.gof.build.simpleFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 简单披萨工厂类
 * @Author yanyuan
 * @Date 17:35 2020/4/4
 * @Version 1.0
 **/
@Slf4j
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        if("VEGG".equals(type)){
            return new PizzaVegg();
        }else if("MEET".equals(type)){
            return new PizzaMeet();
        }
        log.error("暂未支持该类型pizza");
        return null;
    }
}
