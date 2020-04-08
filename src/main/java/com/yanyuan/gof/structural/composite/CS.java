package com.yanyuan.gof.structural.composite;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description leaf叶子节点
 * @Author yanyuan
 * @Date 23:00 2020/4/8
 * @Version 1.0
 **/
@Slf4j
public class CS extends Game{

    public CS(String name) {
        super(name);
    }

    public void display() {
        log.info("正在加载{}游戏", super.getName());
    }
}
