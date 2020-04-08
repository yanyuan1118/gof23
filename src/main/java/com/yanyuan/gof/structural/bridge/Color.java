package com.yanyuan.gof.structural.bridge;

/**
 * @Description 汽车颜色（Implementor）
 * 实现类接口，用于服务于抽象类（Car）, 为抽象类提供必要的属性或维度
 * @Author yanyuan
 * @Date 09:47 2020/4/8
 * @Version 1.0
 **/
public interface Color {
    void addColor(String carType);
}
