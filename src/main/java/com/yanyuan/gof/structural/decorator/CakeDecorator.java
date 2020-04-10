package com.yanyuan.gof.structural.decorator;

/**
 * @Description 抽象装饰类
 * @Author yanyuan
 * @Date 09:39 2020/4/9
 * @Version 1.0
 **/
public class CakeDecorator implements Cake{

    Cake cake;

    //装饰实现类
    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    public String nameDetail() {
        return cake.nameDetail();
    }

    public Double price() {
        return cake.price();
    }
}
