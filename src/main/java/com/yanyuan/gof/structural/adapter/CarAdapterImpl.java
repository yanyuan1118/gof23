package com.yanyuan.gof.structural.adapter;

/**
 * @Description 汽车适配器实现类
 * @Author yanyuan
 * @Date 22:51 2020/4/7
 * @Version 1.0
 **/
public class CarAdapterImpl implements CarAdapter {

    public static String BAND_BWM = "BWM";
    public static String BAND_AUDI = "AUDI";

    CarFactoryImplAUDI carFactoryImplAUDI;
    CarFactoryImplBMW carFactoryImplBMW;

    public Car createCar(String bandType){
        Car car = null;
        if(CarAdapterImpl.BAND_BWM.equals(bandType)){
            carFactoryImplBMW = new CarFactoryImplBMW();
            car = carFactoryImplBMW.createCar();
        }else if(CarAdapterImpl.BAND_AUDI.equals(bandType)){
            carFactoryImplAUDI = new CarFactoryImplAUDI();
            car = carFactoryImplAUDI.createCar();
        }
        return car;
    }

    public Car changeColor(Car car, String color) {
        if(car == null) return null;
        car.setColor(color);
        return car;
    }
}
