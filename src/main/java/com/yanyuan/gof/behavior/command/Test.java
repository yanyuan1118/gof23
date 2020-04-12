package com.yanyuan.gof.behavior.command;

/**
 * @Description 命令模式测试类
 * client
 * @Author yanyuan
 * @Date 12:12 2020/4/11
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args){
        Command add = new AddCommand();
        Invoker invoker = new Invoker(add);
        invoker.calc(10);
        invoker.calc(20);
        invoker.cancel();

        Command multi = new MultiCommand();
        invoker.setCommand(multi);
        invoker.calc(3);
        invoker.calc(2);
        invoker.cancel();

    }


}
