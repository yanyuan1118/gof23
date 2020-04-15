package com.yanyuan.gof.build.factory.v2;

/**
 * @Description 具体工厂
 * @Author yanyuan
 * @Date 09:39 2020/4/15
 * @Version 1.0
 **/
public class IPhoneFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}
