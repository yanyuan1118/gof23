package com.yanyuan.gof.structural.bridge;

/**
 * @Description 汽车实现类（RefinedAbstraction）
 * 扩充抽象类，遵从面向接口编程（面向抽象编程）
 * @Author yanyuan
 * @Date 09:46 2020/4/8
 * @Version 1.0
 **/
public class CarImpl extends Car {
    public void makeCar(String carType) {
        color.addColor(carType);
    }
}
