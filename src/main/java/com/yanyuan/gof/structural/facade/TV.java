package com.yanyuan.gof.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 电视
 * @Author yanyuan
 * @Date 22:08 2020/4/9
 * @Version 1.0
 **/
@Slf4j
public class TV {
    public void open(){
        log.info("打开电视机");
    };

    public void down(){
        log.info("关闭电视机");
    }
}
