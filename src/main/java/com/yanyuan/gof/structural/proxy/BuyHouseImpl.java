package com.yanyuan.gof.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 抽象实现类， RealSubject
 * @Author yanyuan
 * @Date 11:57 2020/4/10
 * @Version 1.0
 **/
@Slf4j
public class BuyHouseImpl implements BuyHouse {
    @Override
    public void buyHouse() {
        log.info("RealSubject 买房");
    }
}
