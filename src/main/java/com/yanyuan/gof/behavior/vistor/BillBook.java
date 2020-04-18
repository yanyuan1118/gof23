package com.yanyuan.gof.behavior.vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description ObjectStructure 对象结构
 *
 * @Author yanyuan
 * @Date 15:13 2020/4/18
 * @Version 1.0
 **/
public class BillBook {

    private List<BillElement> billElementList = new ArrayList<>();

    public void addBill(BillElement billElement){
        billElementList.add(billElement);
    }


    /**
     * 精髓方法：
     *
     * 1、所有访问者都是通过show方法进行最终访问，也就是说谁要访问对象，
     *      都要经过show方法，将访问者传入show方法
     *
     * 2、通过账单循环迭代，可以将所有元素一一列举，
     *    如果对于一些访问者的目的, 可以通过自己的类，对元素进行检索
     *
     * @param vistor
     */
    public void show(Vistor vistor){
        billElementList.stream().forEach(billElement -> {
            billElement.accept(vistor);
        });
    }
}
