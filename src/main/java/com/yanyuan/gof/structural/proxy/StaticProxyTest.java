package com.yanyuan.gof.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 代理模式测试类
 * @Author yanyuan
 * @Date 12:01 2020/4/10
 * @Version 1.0
 **/
@Slf4j
public class StaticProxyTest {

    public static void main(String[] args){
        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHouse();

        log.info("静态代理后----------> ");
        BuyHouseProxy proxy = new BuyHouseProxy(buyHouse);
        proxy.buyHouse();
    }
}
