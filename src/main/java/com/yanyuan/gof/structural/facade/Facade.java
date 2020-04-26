package com.yanyuan.gof.structural.facade;

/**
 * @Description 包装子部件
 * @Author yanyuan
 * @Date 22:11 2020/4/9
 * @Version 1.0
 **/
public class Facade {

    Light light;
    Air air;
    TV tv;

    public Facade(Light light, Air air, TV tv) {
        this.light = light;
        this.air = air;
        this.tv = tv;
    }

    public void allOpen(){
        light.open();
        air.open();
        tv.open();
    }

    public void allDown(){
        tv.down();
        air.down();
        light.down();
    }
}
