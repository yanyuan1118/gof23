package com.yanyuan.gof.behavior.mediator;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description 具体中介者类（核心类）
 * 转发信息，负责转发给对应同事类
 * 代理模式与中介模式的区别：
 * 1、中介者模式支持买家和卖家信息沟通（获取房源，商谈价格），中介模式作用是解耦对象之间的关系
 * 2、代理模块可以办理买房手续，单方交互， 代理模式作用是增强对象的能力
 * @Author yanyuan
 * @Date 10:26 2020/4/14
 * @Version 1.0
 **/
@Getter
@Setter
@Slf4j
public class ConcreteMediator extends Mediator {

    private Seller seller;
    private Buyer buyer;


    //转发消息
    @Override
    public void contact(String message, Person person) {
        //如果是卖家，信息交给买家处理
        if(person instanceof  Seller){
            buyer.getMessage(message);
        }else if(person instanceof Buyer){
            seller.getMessage(message);
        }else {
            log.error("未知类型：{}", person.getClass().getName());
        }

    }
}
