package com.yanyuan.gof.structural.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 适配器模式测试
 * @Author yanyuan
 * @Date 22:54 2020/4/7
 * @Version 1.0
 **/
@Slf4j
public class Test {

    public static void main(String[] args){
        CarAdapterImpl carAdapter = new CarAdapterImpl();
        Car car = carAdapter.createCar(CarAdapterImpl.BAND_AUDI);
        log.info("before change color : {} ", car);
        carAdapter.changeColor(car, "红色");
        log.info("after change color : {} ", car);

    }
}
