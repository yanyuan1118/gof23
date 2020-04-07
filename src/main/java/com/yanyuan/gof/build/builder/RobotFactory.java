package com.yanyuan.gof.build.builder;

/**
 * @Description TODO
 * @Author yanyuan
 * @Date 09:39 2020/4/7
 * @Version 1.0
 **/
public class RobotFactory {

    public Robot createRobot(){
        Robot robot = new Robot();
        robot.setBody("body");
        robot.setHead("head");
        return robot;
    }
}
