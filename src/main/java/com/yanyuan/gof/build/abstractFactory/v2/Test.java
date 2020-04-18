package com.yanyuan.gof.build.abstractFactory.v2;

/**
 * @Description client
 * 测试类
 * @Author yanyuan
 * @Date 23:09 2020/4/17
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        AbstractFactory huaweiFactory = new HuaweiFactory();
        PC huaweiPC = huaweiFactory.makePC();
        huaweiPC.playGame();
        Phone huaweiPhone = huaweiFactory.makePhone();
        huaweiPhone.call("西施");

        AbstractFactory appleFactory = new AppleFactory();
        PC applePC = appleFactory.makePC();
        applePC.playGame();
        Phone iphone = appleFactory.makePhone();
        iphone.call("程咬金");
    }
}
