package com.yanyuan.gof.behavior.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 具体子类 Concrete Class
 * 泡茶
 * @Author yanyuan
 * @Date 16:18 2020/4/17
 * @Version 1.0
 **/
@Slf4j
public class TeaDrink extends Drink{
    @Override
    void addMaterials() {
      log.info("加入绿茶");
    }

    @Override
    void addOther() {
        log.info("加入蜂蜜");
    }
}
