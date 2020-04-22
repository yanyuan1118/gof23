package com.yanyuan.gof.structural.adapter;

/**
 * @Description 汽车适配器实现类-Adapter
 * @Author yanyuan
 * @Date 22:51 2020/4/7
 * @Version 1.0
 **/
public class CarAdapterImpl implements CarAdapter {

    CarFactory carFactory;

    public CarAdapterImpl(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public Car createCar(){
        return carFactory.createCar();
    }

    public Car changeColor(Car car, String color) {
        if(car == null) return null;
        car.setColor(color);
        return car;
    }
}
