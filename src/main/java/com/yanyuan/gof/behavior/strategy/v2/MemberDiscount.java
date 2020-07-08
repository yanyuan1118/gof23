package com.yanyuan.gof.behavior.strategy.v2;


/**
 * @Description Concrete Strategy 具体策略类
 *  会员 7折
 * @Author yanyuan
 * @Date 11:01 2020/4/17
 * @Version 1.0
 **/
public class MemberDiscount extends Discount{

    double discount = 0.7; //七折

    @Override
    public double discountPrice(Double originalPrice) {
        return originalPrice * discount;
    }

}
