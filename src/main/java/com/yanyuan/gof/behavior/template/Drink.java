package com.yanyuan.gof.behavior.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 抽象类
 * @Author yanyuan
 * @Date 16:10 2020/4/17
 * @Version 1.0
 **/
@Slf4j
public abstract class Drink {

    /**
     * 抽象类定义公共方法， 非公共部分需要子类实现
     * 定义流程的顺序，并防止子类修改顺序，子类只能修改其中一个步骤
     */

    final void mark(){
        fireWater();
        addMaterials();
        addOther();
        brewing();
    }

    /**
     * 烧开水
     */
    public void fireWater(){
        log.info("开始烧水");
    }

    public void brewing(){
        log.info("开水冲泡");
    }

    /**
     * 添加原料
     * 例如：咖啡，牛奶等
     */
    abstract void addMaterials();
    abstract void addOther();

}
