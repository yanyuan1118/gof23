package com.yanyuan.gof.build.singleton;

/**
 * @Description 饿汉式
 * @Author yanyuan
 * @Date 23:07 2020/4/5
 * @Version 1.0
 **/
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return singleton;
    }
}
