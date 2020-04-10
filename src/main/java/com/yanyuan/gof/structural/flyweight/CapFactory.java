package com.yanyuan.gof.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 享元工厂类(开辟静态空间)
 * @Author yanyuan
 * @Date 09:46 2020/4/10
 * @Version 1.0
 **/
public class CapFactory {

    //享元模式重点
    //享元池
    // 两个作用：1.减少对象创建，提供对象重用性
    public static Map<String, BottleCap> shareMap = new HashMap<>();

    //关联UnShareCap ?
//    static BottleCap bottleCap;

    public static BottleCap getBottleCap(String color, BottleCap bottleCap){
//        CapFactory.bottleCap = bottleCap;
        if(shareMap.containsKey(color)){
            return shareMap.get(color);
        }
        BottleCap shareCap = new ShareCap(color, bottleCap);
        shareMap.put(color, shareCap);
        return shareCap;
    }
}
