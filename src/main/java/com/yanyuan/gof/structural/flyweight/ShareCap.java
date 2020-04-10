package com.yanyuan.gof.structural.flyweight;

/**
 * @Description ConcreteFlyweight 具体的享元类
 * @Author yanyuan
 * @Date 09:39 2020/4/10
 * @Version 1.0
 **/
public class ShareCap implements BottleCap{

    String color;

    BottleCap bottleCap;

    public ShareCap(String color, BottleCap bottleCap) {
        this.color = color;
        this.bottleCap = bottleCap;
    }

    /**
     * 共享方法
     * @return
     */
    public String getColor() {
        return this.color;
    }

    /**
     * 非共享方法 （享元模式 完整对象= 内部状态+外部状态）
     * @param different
     * @return
     */
    public String getCode(String different) {
        if(bottleCap == null){
            return "活动结束";
        }
        return bottleCap.getCode(different);
    }
}
