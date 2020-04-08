package com.yanyuan.gof.structural.bridge;

/**
 * @Description 测试类
 * @Author yanyuan
 * @Date 09:54 2020/4/8
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args){
        Car car = new CarImpl();
        Color color = new Black();
        car.setColor(color);
        car.makeCar("AUDI");
    }
}
