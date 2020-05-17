package com.yanyuan.gof.behavior.command.v2;

/**
 * @Description 测试类
 * @Author yanyuan
 * @Date 22:16 2020/5/12
 * @Version 1.0
 **/
public class CalcTest {

    public static void main(String[] args) {

        CalcInvoker invoker = new CalcInvoker(CalcEnum.ADD);
        invoker.calc(10);
        invoker.calc(20);
        invoker.cancel();

        invoker.setCalcEnum(CalcEnum.MULTI);
        invoker.calc(3);
        invoker.calc(2);
        invoker.cancel();

    }
}
