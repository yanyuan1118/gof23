package com.yanyuan.gof.behavior.strategy.v2;


/**
 * @Description Concrete Strategy 具体策略类
 *  前一百名下单 8折
 * @Author yanyuan
 * @Date 11:01 2020/4/17
 * @Version 1.0
 **/
public class Top100Discount extends Discount{

    double discount = 0.8; //八折

    @Override
    public double discountPrice(Double originalPrice) {
        return originalPrice * discount;
    }

    @Override
    public String discountType() {
        return "前100名下单优惠";
    }
}
