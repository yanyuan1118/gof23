package com.yanyuan.gof.structural.decorator.example;

import com.yanyuan.gof.structural.decorator.Cake;

/**
 * @Description ConcreteComponent 抽象实现类
 * @Author yanyuan
 * @Date 09:33 2020/4/9
 * @Version 1.0
 **/
public class MeetCakeImpl implements Cake {
    public String nameDetail() {
        return "牛肉手抓饼";
    }

    public Double price() {
        return 7d;
    }
}
