package com.yanyuan.gof.build.builder.v2;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description 具体产品类
 * @Author yanyuan
 * @Date 22:53 2020/4/19
 * @Version 1.0
 **/
@Setter
@Getter
public class Car {
    private String engine;//引擎
    private String seats;//座位
    private String wheels;//车轮
    private String frame; //车架

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", seats='" + seats + '\'' +
                ", wheels='" + wheels + '\'' +
                ", frame='" + frame + '\'' +
                '}';
    }
}
