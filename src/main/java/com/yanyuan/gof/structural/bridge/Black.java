package com.yanyuan.gof.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 汽车喷漆，黑色。ConcreteImplementor
 * @Author yanyuan
 * @Date 09:51 2020/4/8
 * @Version 1.0
 **/
@Slf4j
public class Black implements Color{

    public void addColor(String carType) {
        log.info("汽车类型：{}, 喷漆颜色：黑色", carType);
    }
}
