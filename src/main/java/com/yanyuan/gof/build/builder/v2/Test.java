package com.yanyuan.gof.build.builder.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 建造者模式测试类
 * @Author yanyuan
 * @Date 23:18 2020/4/19
 * @Version 1.0
 **/
@Slf4j
public class Test {
    public static void main(String[] args) {
        Director worker = new Director();
        Car truck = worker.buildCar(new TruckBuilder());
        log.info("卡车制造完成：{}", truck);
        log.info("------------我是分割线------------");
        Car bus = worker.buildCar(new BusBuilder());
        log.info("巴士制造完成：{} ", bus);
    }
}
