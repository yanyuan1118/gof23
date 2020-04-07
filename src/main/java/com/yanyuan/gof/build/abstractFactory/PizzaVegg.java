package com.yanyuan.gof.build.abstractFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description TODO
 * @Author yanyuan
 * @Date 19:36 2020/4/5
 * @Version 1.0
 **/
@Slf4j
public class PizzaVegg extends Pizza {
    void prepare() {
        log.info("预定蔬菜pizza");
    }

    void make() {
        log.info("制作蔬菜pizza, 加热");
    }

    void complete() {
        log.info("完成蔬菜pizza");
    }
}
