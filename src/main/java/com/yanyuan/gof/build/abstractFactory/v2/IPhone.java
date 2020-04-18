package com.yanyuan.gof.build.abstractFactory.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description Concrete ProducB2 具体产品类
 * @Author yanyuan
 * @Date 18:28 2020/4/14
 * @Version 1.0
 **/
@Slf4j
public class IPhone implements Phone {
    @Override
    public void call(String receiver) {
        log.info("iPhone手机拨打{}电话", receiver);
    }
}
