package com.yanyuan.gof.behavior.strategy.v2;

/**
 * @Description Strategy 抽象策略类
 * @Author yanyuan
 * @Date 10:55 2020/4/17
 * @Version 1.0
 **/
public abstract class Discount {

    abstract double discountPrice(Double originalPrice);
}
