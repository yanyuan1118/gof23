package com.yanyuan.gof.behavior.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 具体子类 Concrete Class
 * 泡咖啡
 * @Author yanyuan
 * @Date 16:16 2020/4/17
 * @Version 1.0
 **/
@Slf4j
public class CoffeeDrink extends Drink {
    @Override
    void addMaterials() {
        log.info("加入咖啡");
    }

    @Override
    void addOther() {
        log.info("加入牛奶");
    }
}
