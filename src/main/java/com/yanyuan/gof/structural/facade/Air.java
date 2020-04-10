package com.yanyuan.gof.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 空调
 * @Author yanyuan
 * @Date 22:10 2020/4/9
 * @Version 1.0
 **/
@Slf4j
public class Air {

    public void open(){
        log.info("打开空调");
    };

    public void down(){
        log.info("关闭空调");
    }
}
