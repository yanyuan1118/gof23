package com.yanyuan.gof.structural.adapter;

/**
 * @Description 奥迪汽车工厂
 * @Author yanyuan
 * @Date 22:46 2020/4/7
 * @Version 1.0
 **/
public class CarFactoryImplAUDI implements CarFactory {
    public Car createCar() {
        return new Car("白色", "奥迪");
    }
}
