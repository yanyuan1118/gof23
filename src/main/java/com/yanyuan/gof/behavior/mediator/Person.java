package com.yanyuan.gof.behavior.mediator;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description Colleague 抽象同事类
 * @Author yanyuan
 * @Date 09:58 2020/4/14
 * @Version 1.0
 **/
@Setter
@Getter
public abstract class Person {

    String name;

    Mediator mediator;


    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
