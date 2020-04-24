package com.yanyuan.gof.build.singleton;

/**
 * @Description 懒汉式
 * @Author yanyuan
 * @Date 23:06 2020/4/5
 * @Version 1.0
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton;
    private LazySingleton(){
    }
    public synchronized static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
