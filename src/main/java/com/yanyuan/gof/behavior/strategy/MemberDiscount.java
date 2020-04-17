package com.yanyuan.gof.behavior.strategy;

/**
 * @Description Concrete Strategy 具体策略类
 *  会员 7折
 * @Author yanyuan
 * @Date 11:01 2020/4/17
 * @Version 1.0
 **/
public class MemberDiscount implements Discount{

    double discount = 0.7; //七折

    @Override
    public double discountPrice(double originalPrice) {
        return originalPrice * discount;
    }

    @Override
    public String discountType() {
        return "会员折扣";
    }
}
