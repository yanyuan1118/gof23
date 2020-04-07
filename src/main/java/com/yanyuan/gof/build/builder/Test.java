package com.yanyuan.gof.build.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description TODO
 * @Author yanyuan
 * @Date 09:41 2020/4/7
 * @Version 1.0
 **/
@Slf4j
public class Test {
    public static void main(String[] args){
        Worker worker = new Worker();
        Robot robot = worker.buildRobot(new SmartRobotBuilder());
        log.info("robot : {} ", robot);
    }
}
