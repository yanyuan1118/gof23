package com.yanyuan.gof.structural.decorator;

/**
 * @Description 鸡蛋，Decorator具体实现类
 * @Author yanyuan
 * @Date 09:41 2020/4/9
 * @Version 1.0
 **/
public class EggCakeDecorator extends CakeDecorator{

    public EggCakeDecorator(Cake cake) {
        super(cake);
    }

    //关键部分

    @Override
    public String nameDetail() {
        return "鸡蛋，" + cake.nameDetail();
    }

    @Override
    public Double price() {
        return 1.5 + cake.price();
    }
}
