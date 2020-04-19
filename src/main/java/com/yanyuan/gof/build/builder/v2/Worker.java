package com.yanyuan.gof.build.builder.v2;

/**
 * @Description worker 指挥者类
 * @Author yanyuan
 * @Date 23:11 2020/4/19
 * @Version 1.0
 **/
public class Worker {
    public Car buildCar(CarBuilder builder){
        builder.createEngine();
        builder.createFrame();
        builder.createSeats();
        builder.createWheels();
        return builder.createCar();
    }
}
