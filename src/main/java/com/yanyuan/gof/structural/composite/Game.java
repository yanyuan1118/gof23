package com.yanyuan.gof.structural.composite;

/**
 * @Description Component
 * 组合模式对象声明接口/抽象对象
 * @Author yanyuan
 * @Date 22:54 2020/4/8
 * @Version 1.0
 **/
public abstract class Game {
    String name;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}
