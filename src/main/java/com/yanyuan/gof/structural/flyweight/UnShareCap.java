package com.yanyuan.gof.structural.flyweight;

import com.sun.javafx.binding.StringFormatter;

/**
 * @Description TODO
 * @Author yanyuan
 * @Date 09:36 2020/4/10
 * @Version 1.0
 **/
public class UnShareCap implements BottleCap {

    public String getColor() {
        return null;
    }

    /**
     * 非共享实现
     * @return
     */
    public String getCode(String different) {

        return StringFormatter.concat( "抽奖码: ", different).getValue();
    }
}
