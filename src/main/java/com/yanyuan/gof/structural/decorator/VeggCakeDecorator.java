package com.yanyuan.gof.structural.decorator;

/**
 * @Description 蔬菜，Decorator具体实现类
 * @Author yanyuan
 * @Date 09:41 2020/4/9
 * @Version 1.0
 **/
public class VeggCakeDecorator extends CakeDecorator{

    public VeggCakeDecorator(Cake cake) {
        super(cake);
    }

    //关键部分

    @Override
    public String nameDetail() {
        return "蔬菜，" + cake.nameDetail();
    }

    @Override
    public Double price() {
        return 0.5 + cake.price();
    }
}
