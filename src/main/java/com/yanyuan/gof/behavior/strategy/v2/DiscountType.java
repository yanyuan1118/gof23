package com.yanyuan.gof.behavior.strategy.v2;

/**
 * @author: yanyuan
 * @Date: 2020/7/8 08:41
 * @Description: 折扣类型枚举
 */
public enum DiscountType {

    MEMBER("会员折扣", "com.yanyuan.gof.behavior.strategy.v2.MemberDiscount"),
    FIRST_ORDER("首次下单", "com.yanyuan.gof.behavior.strategy.v2.FirstOrderDiscount"),
    TOP100("前100名下单", "com.yanyuan.gof.behavior.strategy.v2.Top100Discount");

    private String name;

    private String className;

    DiscountType(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }
}
