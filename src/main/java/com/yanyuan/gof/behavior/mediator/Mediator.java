package com.yanyuan.gof.behavior.mediator;

/**
 * @Description 中介者抽象类
 * @Author yanyuan
 * @Date 09:57 2020/4/14
 * @Version 1.0
 **/
public abstract class Mediator {

    //收集信息，转发信息
    public abstract void contact(String message, Person person);
}
