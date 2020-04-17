package com.yanyuan.gof.behavior.strategy;

/**
 * @Description
 *  首单价格 5折
 * @Author yanyuan
 * @Date 11:01 2020/4/17
 * @Version 1.0
 **/
public class FirstOrderDiscount implements Discount{

    double discount = 0.5; //五折

    @Override
    public double discountPrice(double originalPrice) {
        return originalPrice * discount;
    }

    @Override
    public String discountType() {
        return "首次下单";
    }
}
