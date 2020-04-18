package com.yanyuan.gof.build.abstractFactory.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description Concrete ProductA1
 * @Author yanyuan
 * @Date 23:01 2020/4/17
 * @Version 1.0
 **/
@Slf4j
public class HuaweiPC implements PC {
    @Override
    public void playGame() {
      log.info("使用华为电脑玩DOTA");
    }
}
