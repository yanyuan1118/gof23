package com.yanyuan.gof.behavior.interpreter;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 解释器测试类
 * @Author yanyuan
 * @Date 10:53 2020/4/13
 * @Version 1.0
 **/
@Slf4j
public class Test {

    public static void main(String[] args){
        String statement = "3 * 2 * 4 / 3 % 5 * 2 + 1 - 2";
        Calculator calculator = new Calculator();
        calculator.build(statement);
        log.info("statement : {} ------> value = {}", statement, calculator.compute());
    }
}
