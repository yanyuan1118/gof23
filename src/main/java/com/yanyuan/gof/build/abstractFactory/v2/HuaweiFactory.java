package com.yanyuan.gof.build.abstractFactory.v2;

/**
 * @Description ConcreteFactory1
 * 华为制造工厂
 * @Author yanyuan
 * @Date 23:07 2020/4/17
 * @Version 1.0
 **/
public class HuaweiFactory implements AbstractFactory {

    @Override
    public PC makePC() {
        return new HuaweiPC();
    }

    @Override
    public Phone makePhone() {
        return new HuaweiPhone();
    }
}
