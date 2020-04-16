package com.yanyuan.gof.behavior.memento;

import lombok.Data;

/**
 * @Description Memento 备忘录
 * 用于存储Originator的内部状态
 * @Author yanyuan
 * @Date 22:58 2020/4/15
 * @Version 1.0
 **/
@Data
public class Memento {
    private int level;//等级
    private int blood;//血量

    public Memento(int level, int blood) {
        this.level = level;
        this.blood = blood;
    }
}
