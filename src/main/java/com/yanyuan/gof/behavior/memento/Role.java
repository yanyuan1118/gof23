package com.yanyuan.gof.behavior.memento;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description Originator 原发器
 * @Author yanyuan
 * @Date 22:51 2020/4/15
 * @Version 1.0
 **/
@Getter
@Setter
@Slf4j
public class Role {
    private int level;//等级
    private int blood;//血量

    public Role(int level, int blood) {
        this.level = level;
        this.blood = blood;
    }

    public void display(){
        log.info("当前状态：等级 {}, 血量 {}", level, blood);
    }

    //恢复之前的状态
    public void restore(Memento memento){
        this.level = memento.getLevel();
        this.blood = memento.getBlood();
    }

    //创建备忘录
    public Memento createMemento(){
        return new Memento(this.level, this.blood);
    }
}
