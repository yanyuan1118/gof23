package com.yanyuan.gof.behavior.strategy;

/**
 * @Description Strategy 抽象策略类
 * @Author yanyuan
 * @Date 10:55 2020/4/17
 * @Version 1.0
 **/
public interface Discount {
    double discountPrice(double originalPrice);
    String discountType();
}
