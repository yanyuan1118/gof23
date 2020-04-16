package com.yanyuan.gof.behavior.observe;

/**
 * @Description 抽象观察者
 * @Author yanyuan
 * @Date 10:18 2020/4/16
 * @Version 1.0
 **/
public interface Observe {

    String name();

    /**
     * @param weather 天气
     */
    void update(Weather weather);
}
