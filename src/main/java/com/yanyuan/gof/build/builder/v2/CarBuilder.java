package com.yanyuan.gof.build.builder.v2;

/**
 * @Description
 * @Author yanyuan
 * @Date 23:04 2020/4/19
 * @Version 1.0
 **/
public interface CarBuilder {
    void createEngine();
    void createSeats();
    void createWheels();
    void createFrame();
    Car createCar();
}
