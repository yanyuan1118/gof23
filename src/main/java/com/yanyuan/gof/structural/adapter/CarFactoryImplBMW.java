package com.yanyuan.gof.structural.adapter;

/**
 * @Description 宝马创建工厂
 * @Author yanyuan
 * @Date 22:48 2020/4/7
 * @Version 1.0
 **/
public class CarFactoryImplBMW implements CarFactory{
    public Car createCar() {
        return new Car("白色", "宝马");
    }
}
