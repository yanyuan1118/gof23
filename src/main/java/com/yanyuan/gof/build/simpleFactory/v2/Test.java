package com.yanyuan.gof.build.simpleFactory.v2;

/**
 * @Description 简单工厂模式测试类
 * @Author yanyuan
 * @Date 22:10 2020/4/14
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Phone huaweiPhone = factory.createPhone("HUAWEI");
        huaweiPhone.make();
        huaweiPhone.call();

        Phone iPhone = factory.createPhone("IPHONE");
        iPhone.make();
        iPhone.call();

    }
}
