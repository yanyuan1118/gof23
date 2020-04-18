package com.yanyuan.gof.build.abstractFactory.v2;

/**
 * @Description ConcreteFactory2
 * 苹果制造工厂
 * @Author yanyuan
 * @Date 23:07 2020/4/17
 * @Version 1.0
 **/
public class AppleFactory implements AbstractFactory {

    @Override
    public PC makePC() {
        return new ApplePC();
    }

    @Override
    public Phone makePhone() {
        return new IPhone();
    }
}
