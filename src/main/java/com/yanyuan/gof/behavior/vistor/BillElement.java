package com.yanyuan.gof.behavior.vistor;

/**
 * @Description 抽象元素 Element
 * 账单
 *
 * ObjectStructure(账本)对象结构包含Element(账单)
 * 重点：
 *      1、元素类需要提供接受访问的方法
 *      2、访问类提供访问方法，访问的也是单个元素（ExpenseBillElement/IncomeBillELement）
 *      3、真正的访问接收者是对象类（BillBook）
 * @Author yanyuan
 * @Date 14:03 2020/4/18
 * @Version 1.0
 **/
public interface BillElement {
    void accept(Vistor vistor);
}
