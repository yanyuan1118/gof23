package com.yanyuan.gof.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 灯
 * @Author yanyuan
 * @Date 22:09 2020/4/9
 * @Version 1.0
 **/
@Slf4j
public class Light {

    public void open(){
        log.info("开灯");
    };

    public void down(){
        log.info("关灯");
    }
}
