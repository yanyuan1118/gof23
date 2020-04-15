package com.yanyuan.gof.build.simpleFactory.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 华为手机
 * @Author yanyuan
 * @Date 18:30 2020/4/14
 * @Version 1.0
 **/
@Slf4j
public class HuaweiPhone implements Phone {
    @Override
    public void make() {
        log.info("华为手机制作完成");
    }

    @Override
    public void call() {
        log.info("华为手机拨打电话");
    }
}
