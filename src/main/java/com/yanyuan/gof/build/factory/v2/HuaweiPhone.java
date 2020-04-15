package com.yanyuan.gof.build.factory.v2;

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
    public void call(String receiver) {
        log.info("华为手机拨打{}电话", receiver);
    }
}
