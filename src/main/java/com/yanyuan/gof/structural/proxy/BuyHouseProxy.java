package com.yanyuan.gof.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 代理类
 * 1.继承于抽象类，
 * 2.关联真实实现类
 * @Author yanyuan
 * @Date 11:58 2020/4/10
 * @Version 1.0
 **/
@Slf4j
public class BuyHouseProxy implements BuyHouse {

    BuyHouse buyHouse;

    public BuyHouseProxy(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        log.info("选择房源");
        log.info("洽谈价格");
        buyHouse.buyHouse();
        log.info("最终成交");
    }
}
