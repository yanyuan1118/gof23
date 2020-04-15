package com.yanyuan.gof.build.factory.v2;

import com.yanyuan.gof.build.simpleFactory.v2.SimpleFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description 简单工厂模式测试类
 * @Author yanyuan
 * @Date 22:10 2020/4/14
 * @Version 1.0
 **/
@Slf4j
public class Test {

    public static void main(String[] args) {
        Factory huaweiFactory = new HuaweiFactory();
        Phone huaweiPhone = huaweiFactory.createPhone();
        huaweiPhone.call("貂蝉");

        Factory iponeFactory = new IPhoneFactory();
        iponeFactory.createPhone().call("小乔");
    }
}
