package com.yanyuan.gof.behavior.iterator;

/**
 * @Description 迭代器角色
 * @Author yanyuan
 * @Date 23:18 2020/4/13
 * @Version 1.0
 **/
public interface Iterator {

    boolean hasNext();

    Object next();
}
