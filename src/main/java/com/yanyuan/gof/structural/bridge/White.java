package com.yanyuan.gof.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 汽车喷漆，白色。ConcreteImplementor
 * @Author yanyuan
 * @Date 09:50 2020/4/8
 * @Version 1.0
 **/
@Slf4j
public class White implements Color {
    public void addColor(String carType) {
        log.info("汽车类型：{}, 喷漆颜色：白色", carType);
    }
}
