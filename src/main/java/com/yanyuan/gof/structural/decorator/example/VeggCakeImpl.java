package com.yanyuan.gof.structural.decorator.example;

import com.yanyuan.gof.structural.decorator.Cake;

/**
 * @Description ConcreteComponent 抽象实现类
 * @Author yanyuan
 * @Date 09:36 2020/4/9
 * @Version 1.0
 **/
public class VeggCakeImpl implements Cake {
    public String nameDetail() {
        return "蔬菜手抓饼";
    }

    public Double price() {
        return 5.5d;
    }
}
