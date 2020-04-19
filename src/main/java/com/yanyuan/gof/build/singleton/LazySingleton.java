package com.yanyuan.gof.build.singleton;

/**
 * @Description 懒汉式
 * @Author yanyuan
 * @Date 23:06 2020/4/5
 * @Version 1.0
 **/
public class LazySingleton {
    private static volatile LazySingleton lazySingleton;
    private LazySingleton(){
    }
    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized(LazySingleton.class){
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }
}
