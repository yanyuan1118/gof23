package com.yanyuan.gof.build.builder;

/**
 * @Description 实现者
 * @Author yanyuan
 * @Date 09:53 2020/4/7
 * @Version 1.0
 **/
public class SmartRobotBuilder implements RobotBuilder {

    Robot robot = new Robot();

    public void createHead() {
        String head = "simple";
        String cpu = "smart";
        String result = head.concat(cpu);
        robot.setHead(result);
    }

    public void createBody() {
        String body = "SmartBody";
        robot.setBody(body);
    }

    public void createLegs() {
        String legs = "SmartLegs";
        robot.setLegs(legs);
    }

    public Robot createRobot() {
        return robot;
    }
}
