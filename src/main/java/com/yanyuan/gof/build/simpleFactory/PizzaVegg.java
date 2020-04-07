package com.yanyuan.gof.build.simpleFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 蔬菜披萨
 * @Author yanyuan
 * @Date 17:19 2020/4/4
 * @Version 1.0
 **/
@Slf4j
public class PizzaVegg extends Pizza {

    private String name = "蔬菜披萨";

    public void prepare() {
        log.info("{}准备中", name);
    }

    public void make() {
        log.info("{}制作中", name);
    }

    public void complete() {
        log.info("{}制作完成", name);
    }
}
