package com.yanyuan.gof.build.factory.v2;

/**
 * @Description Concrete Factory 具体工厂
 * @Author yanyuan
 * @Date 09:38 2020/4/15
 * @Version 1.0
 **/
public class HuaweiFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }
}
