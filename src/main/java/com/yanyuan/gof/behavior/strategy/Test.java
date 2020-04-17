package com.yanyuan.gof.behavior.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 策略模式测试类
 *
 * 策略模式与状态模式区别？
 * 1、状态模式设计初衷（定义）是为了改变环境的状态而出现的，策略模式设计是为了能够为对象提供策略而产生的
 * 2、从相互关联的关系而言，环境类都对抽象的状态类和策略类进行了关联，不同点：策略类不关注环境类的变化。状态类需要负责更改环境类内部状态
 * 3、实践经验的区别，策略模式是与我们指定的策略行为相关，并不关心策略的使用者，但是状态模式要求状态类变更环境类的内部状态
 * 4、状态模式与策略模式能完美配置，是因为模式结构基本一样
 * 5、状态模式与策略模式的诞生是为了去除多重，复杂的IF ELSE条件判断
 *  @Author yanyuan
 * @Date 22:43 2020/4/16
 * @Version 1.0
 **/
@Slf4j
public class Test {

    public static void main(String[] args) {
        Room room = new Room();
        room.setPrice(200);//设置原价
        Discount discount = new MemberDiscount();
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

