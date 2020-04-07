package com.yanyuan.gof.build.simpleFactory;

/**
 * @Description 抽象产品类，作为父类，供各种pizza种类继承
 * @Author yanyuan
 * @Date 17:17 2020/4/4
 * @Version 1.0
 **/
public abstract class Pizza {

    public abstract void prepare();
    public abstract void make();
    public abstract void complete();
}
