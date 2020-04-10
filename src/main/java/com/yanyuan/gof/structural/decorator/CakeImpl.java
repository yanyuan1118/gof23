package com.yanyuan.gof.structural.decorator;

/**
 * @Description ConcreteComponent 抽象实现类
 * 被装饰对象类（原型类，这个原型需要被装饰）
 * @Author yanyuan
 * @Date 09:30 2020/4/9
 * @Version 1.0
 **/
public class CakeImpl implements Cake {


    /**
     * 组合->鸡蛋，牛肉，蔬菜, 鸡蛋+牛肉，鸡蛋+蔬菜，牛肉＋蔬菜,鸡蛋+牛肉+蔬菜
     */

    public String nameDetail() {
        return "原味手抓饼";
    }

    public Double price() {
        return 5d;
    }
}
