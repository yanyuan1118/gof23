package com.yanyuan.gof.structural.proxy.dynamic;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description 动态代理
 * 实现InvocationHandler接口
 * @Author yanyuan
 * @Date 13:56 2020/4/10
 * @Version 1.0
 **/
@Slf4j
public class DynamicProxy implements InvocationHandler {

    //代理类需要关联我们真实角色
    Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("选择房源");
        log.info("洽谈价格");
        //通过反射调用真实方法
        Object result = method.invoke(object, args);
        log.info("最终成交");
        return result;
    }
}
