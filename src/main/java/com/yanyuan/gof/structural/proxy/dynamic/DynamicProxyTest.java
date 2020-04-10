package com.yanyuan.gof.structural.proxy.dynamic;

import com.yanyuan.gof.structural.proxy.BuyHouse;
import com.yanyuan.gof.structural.proxy.BuyHouseImpl;

import java.lang.reflect.Proxy;

/**
 * @Description 动态类测试类
 * @Author yanyuan
 * @Date 14:05 2020/4/10
 * @Version 1.0
 **/
public class DynamicProxyTest {

    public static void main(String[] args) {

        //真实角色
        BuyHouse buyHouse = new BuyHouseImpl();

        /**
         * ClassLoader loader,
         * Class<?>[] interfaces,
         * invocationHandler h
         */
        BuyHouse proxy = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),
                new Class[]{BuyHouse.class},
                new DynamicProxy(buyHouse));
        proxy.buyHouse();
    }
}
