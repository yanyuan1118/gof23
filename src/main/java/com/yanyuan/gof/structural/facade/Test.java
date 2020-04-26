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
        facade.allOpen();//print: 开灯,打开空调，打开电视机
        facade.allDown();//print: 关灯,关闭空调，关闭电视机
    }
}
