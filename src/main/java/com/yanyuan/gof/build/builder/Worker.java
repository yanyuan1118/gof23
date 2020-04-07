package com.yanyuan.gof.build.builder;

/**
 * @Description 指挥者
 * @Author yanyuan
 * @Date 09:59 2020/4/7
 * @Version 1.0
 **/
public class Worker {
    public Robot buildRobot(RobotBuilder robotBuilder){
        robotBuilder.createHead();
        robotBuilder.createBody();
        robotBuilder.createLegs();
        return robotBuilder.createRobot();
    }
}
