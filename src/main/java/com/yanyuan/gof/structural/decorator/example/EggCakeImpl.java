package com.yanyuan.gof.structural.decorator.example;

import com.yanyuan.gof.structural.decorator.Cake;

/**
 * @Description ConcreteComponent 抽象实现类
 * @Author yanyuan
 * @Date 09:32 2020/4/9
 * @Version 1.0
 **/
public class EggCakeImpl implements Cake {
    public String nameDetail() {
        return "鸡蛋手抓饼";
    }

    public Double price() {
        return 6.5d;
    }
}
