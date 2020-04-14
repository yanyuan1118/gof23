package com.yanyuan.gof.behavior.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description ConcreteColleague 具体同事类
 * 卖家 中介者需要联系的一方存在
 * @Author yanyuan
 * @Date 10:04 2020/4/14
 * @Version 1.0
 **/
@Slf4j
public class Seller extends Person {

    public Seller(String name, Mediator mediator) {
        super(name, mediator);
    }

    //联系中介者
    public void contact(String message){
        mediator.contact(message, this);
    }

    //处理消息
    public void getMessage(String message){
        log.info("卖家:{}, 收到信息：{}", super.name, message);
    }
}
