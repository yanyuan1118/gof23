package com.yanyuan.gof.build.builder.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 卡车
 * @Author yanyuan
 * @Date 23:14 2020/4/19
 * @Version 1.0
 **/
@Slf4j
public class TruckBuilder implements CarBuilder {
    Car car = new Car();
    @Override
    public void createEngine() {
      log.info("制造1000马力发动机");
      car.setEngine("1000马力发动机");
    }

    @Override
    public void createSeats() {
        log.info("制造2个座位");
        car.setSeats("2个座位");
    }

    @Override
    public void createWheels() {
        log.info("制造12个车轮");
        car.setWheels("12个车轮");
    }

    @Override
    public void createFrame() {
        log.info("制造高强度车架");
        car.setFrame("高强度车架");
    }

    @Override
    public Car createCar() {
        return car;
    }
}
