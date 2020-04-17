package com.yanyuan.gof.behavior.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 策略模式测试类
 * @Author yanyuan
 * @Date 22:43 2020/4/16
 * @Version 1.0
 **/
@Slf4j
public class Test {

    public static void main(String[] args) {
        Room room = new Room();
        room.setPrice(200);//设置原价
        Discount discount = new Top100Discount();
        room.setDiscount(discount);
        log.info("尊敬的用户: 您所预定的房价使用 {} 折扣, 折后价格 {} RMB ", discount.discountType(), room.getPrice());


        room.reservationRoom();
        room.showCurrState();

        room.checkinRoom();
        room.showCurrState();

        room.checkoutRoom();
        room.showCurrState();

    }
}

