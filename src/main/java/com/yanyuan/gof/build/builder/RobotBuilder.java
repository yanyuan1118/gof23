package com.yanyuan.gof.build.builder;

/**
 * @Description 抽象建造者类
 * @Author yanyuan
 * @Date 09:49 2020/4/7
 * @Version 1.0
 **/
public interface RobotBuilder {
    void createHead();
    void createBody();
    void createLegs();
    Robot createRobot();
}
