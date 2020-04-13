package com.yanyuan.gof.behavior.iterator;

/**
 * @Description Aggregate 抽象容器类
 * @Author yanyuan
 * @Date 23:22 2020/4/13
 * @Version 1.0
 **/
public interface Aggregate {

    void add(Object object);

    Object get(int index);

    int getSize();

    //获取迭代器
    Iterator iterator();
}
