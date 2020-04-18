package com.yanyuan.gof.build.abstractFactory.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description Concrete ProductA2
 * @Author yanyuan
 * @Date 23:01 2020/4/17
 * @Version 1.0
 **/
@Slf4j
public class ApplePC implements PC {
    @Override
    public void playGame() {
      log.info("使用苹果电脑玩国际象棋");
    }
}
