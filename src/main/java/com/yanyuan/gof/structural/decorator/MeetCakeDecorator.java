package com.yanyuan.gof.structural.decorator;

/**
 * @Description 牛肉， Decorator具体实现类
 * @Author yanyuan
 * @Date 09:41 2020/4/9
 * @Version 1.0
 **/
public class MeetCakeDecorator extends CakeDecorator{

    public MeetCakeDecorator(Cake cake) {
        super(cake);
    }

    //关键部分

    @Override
    public String nameDetail() {
        return "牛肉，" + cake.nameDetail();
    }

    @Override
    public Double price() {
        return 2 + cake.price();
    }
}
