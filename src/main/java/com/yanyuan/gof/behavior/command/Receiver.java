package com.yanyuan.gof.behavior.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description Receiver 接收者
 * @Author yanyuan
 * @Date 12:01 2020/4/11
 * @Version 1.0
 **/
@Slf4j
public class Receiver {

    private int number;

    public int add(int value){
        log.info("加法 {} + {} ", number, value);
        return number += value;
    }

    public int subtract(int value){
        log.info("减法 {} - {} ", number, value);
        return number -= value;
    }

    public int multi(int value){
        log.info("乘法 {} * {} ", number, value);
        return number *= value;
    }

    public int division(int value){
        log.info("除法 {} / {} ", number, value);
        return number /= value;
    }

}
