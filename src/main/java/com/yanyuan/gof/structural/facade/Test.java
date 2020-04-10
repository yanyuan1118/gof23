package com.yanyuan.gof.structural.facade;

/**
 * @Description 外观模式测试类
 * @Author yanyuan
 * @Date 22:12 2020/4/9
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args){
        Facade facade = new Facade(new Light(), new Air(), new TV());
        facade.allOpen();
        facade.allDown();
    }
}
