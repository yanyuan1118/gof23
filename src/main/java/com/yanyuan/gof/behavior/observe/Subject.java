package com.yanyuan.gof.behavior.observe;

/**
 * @Description 抽象主题类
 * @Author yanyuan
 * @Date 10:16 2020/4/16
 * @Version 1.0
 **/
public interface Subject {

    //注册观察者
    void registerObserve(Observe observe);

    //移除观察者
    void removeObserve(Observe observe);

    //通知观察者
    void notifyAllObserve();
}
