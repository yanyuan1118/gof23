package com.yanyuan.gof.behavior.strategy.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: yanyuan
 * @Date: 2020/7/7 15:10
 * @Description:
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        Double originalPrice = 200d;
        //首次下单
        DiscountType type = DiscountType.FIRST_ORDER;
        double price = Context.discountPrice(type, originalPrice);
        log.info("尊敬的用户: 您所预定的游乐园门票使用 [{}] 折扣, 原价{} RMB, 折后价格 {} RMB ",  type.getName(), originalPrice, price);

        //会员折扣
        type = DiscountType.MEMBER;
        price = Context.discountPrice(type, originalPrice);
        log.info("尊敬的用户: 您所预定的游乐园门票使用 [{}] 折扣, 原价{} RMB, 折后价格 {} RMB ",  type.getName(), originalPrice, price);
    }
}
