package com.yanyuan.gof.build.abstractFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description TODO
 * @Author yanyuan
 * @Date 19:37 2020/4/5
 * @Version 1.0
 **/
@Slf4j
public class MilkApple extends Milk {
    void prepare() {
        log.info("预定苹果味牛奶");
    }

    void make() {
        log.info("制作苹果味牛奶，加热");

    }

    void complete() {
        log.info("完成苹果味牛奶");
    }
}
