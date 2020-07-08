package com.yanyuan.gof.behavior.strategy.v2;


/**
 * @Description
 *  首单价格 5折
 * @Author yanyuan
 * @Date 11:01 2020/4/17
 * @Version 1.0
 **/
public class FirstOrderDiscount extends Discount{

    double discount = 0.5; //五折

    @Override
    public double discountPrice(Double originalPrice) {
        return originalPrice * discount;
    }

}
