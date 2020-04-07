package com.yanyuan.gof.build.abstractFactory;

/**
 * @Description pizza制作
 * @Author yanyuan
 * @Date 19:29 2020/4/5
 * @Version 1.0
 **/
public abstract class Pizza {
    abstract void prepare();
    abstract void make();
    abstract void complete();
}
