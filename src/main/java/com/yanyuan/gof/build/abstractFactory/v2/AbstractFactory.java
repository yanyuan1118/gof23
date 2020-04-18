package com.yanyuan.gof.build.abstractFactory.v2;

/**
 * @Description 抽象工厂类
 * @Author yanyuan
 * @Date 23:06 2020/4/17
 * @Version 1.0
 **/
public interface AbstractFactory {
    PC makePC();
    Phone makePhone();
}
