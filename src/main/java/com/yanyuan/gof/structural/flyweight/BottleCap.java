package com.yanyuan.gof.structural.flyweight;

/**
 * @Description Flyweight 抽象享元类
 * @Author yanyuan
 * @Date 09:35 2020/4/10
 * @Version 1.0
 **/
public interface BottleCap {
    /**
     * 共享方法
     * @return
     */
    String getColor();

    /**
     * 非共享方法
     * @param different
     * @return
     */
    String getCode(String different);
}
