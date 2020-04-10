package com.yanyuan.gof.structural.flyweight;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @Description 享元模式测试类/客户端
 * @Author yanyuan
 * @Date 09:52 2020/4/10
 * @Version 1.0
 **/
@Slf4j
public class Test {

    public static void main(String[] args) {
        //两种享元模式
        //1、简单享元模式（不考虑外部状态）
        //红色，黄色，绿色，活动结束，不需要二维码
        BottleCap redCap = CapFactory.getBottleCap("红色", null);//第二个参数，决定了外部状态
        BottleCap yellowCap = CapFactory.getBottleCap("黄色", null);
        BottleCap greenCap = CapFactory.getBottleCap("绿色", null);

        log.info(" 红色瓶盖: {}, {}", redCap.getColor(), redCap.getCode("张三兑奖"));
        log.info(" 黄色瓶盖: {}, {}", yellowCap.getColor(), yellowCap.getCode("李四兑奖"));
        log.info(" 绿色瓶盖: {}, {} ", greenCap.getColor(), greenCap.getCode("王五兑奖"));


        //2.完整享元模式（内部状态 + 外部状态）
        //抽奖码
        Random random = new Random();
        String different = String.valueOf(random.nextInt(9999) + 1000);

        BottleCap newRedCap = CapFactory.getBottleCap("有奖红色", new UnShareCap());
        // redCap.getCode(different), redCap.getColor()
        log.info("红色瓶盖抽奖 : {}， {} ", newRedCap.getColor(), newRedCap.getCode(different));
    }
}
