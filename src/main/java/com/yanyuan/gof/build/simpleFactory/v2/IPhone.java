package com.yanyuan.gof.build.simpleFactory.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description Concrete Product  具体产品类
 * @Author yanyuan
 * @Date 18:28 2020/4/14
 * @Version 1.0
 **/
@Slf4j
public class IPhone implements Phone{
    @Override
    public void make() {
        log.info("制作iPhone手机");
    }

    @Override
    public void call() {
        log.info("iPhone手机拨打电话");
    }
}
