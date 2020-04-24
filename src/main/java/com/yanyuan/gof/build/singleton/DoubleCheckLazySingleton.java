package com.yanyuan.gof.build.singleton;

/**
 * @Description 懒汉式(双重检查)
 * @Author yanyuan
 * @Date 23:06 2020/4/5
 * @Version 1.0
 **/
public class DoubleCheckLazySingleton {
    private static volatile DoubleCheckLazySingleton doubleCheckLazySingleton;
    private DoubleCheckLazySingleton(){
    }
    public static DoubleCheckLazySingleton getInstance(){
        if(doubleCheckLazySingleton == null){
            synchronized(DoubleCheckLazySingleton.class){
                if(doubleCheckLazySingleton == null){
                    doubleCheckLazySingleton = new DoubleCheckLazySingleton();
                }
            }
        }
        return doubleCheckLazySingleton;
    }
}
