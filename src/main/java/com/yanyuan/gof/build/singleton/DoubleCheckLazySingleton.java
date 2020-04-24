package com.yanyuan.gof.build.singleton;

/**
 * @Description 懒汉式(双重检查)
 * @Author yanyuan
 * @Date 23:06 2020/4/5
 * @Version 1.0
 **/
public class DoubleCheckLazySingleton {
    /**
     * volatile修饰变量：
     * 1、保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。
     * 2、禁止进行指令重排序。
     */
    private static volatile DoubleCheckLazySingleton doubleCheckLazySingleton;
    private DoubleCheckLazySingleton(){
    }
    public static DoubleCheckLazySingleton getInstance(){
        if(doubleCheckLazySingleton == null){//第一次检查
            synchronized(DoubleCheckLazySingleton.class){//第二次检查
                if(doubleCheckLazySingleton == null){
                    doubleCheckLazySingleton = new DoubleCheckLazySingleton();
                }
            }
        }
        return doubleCheckLazySingleton;
    }
}
