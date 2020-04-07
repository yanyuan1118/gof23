package com.yanyuan.gof.structural.adapter;

import lombok.Data;

/**
 * @Description 汽车
 * @Author yanyuan
 * @Date 22:45 2020/4/7
 * @Version 1.0
 **/
@Data
public class Car {
    private String color;//颜色
    private String band;//品牌

    public Car() {
    }

    public Car(String color, String band) {
        this.color = color;
        this.band = band;
    }
}
