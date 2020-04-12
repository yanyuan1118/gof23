package com.yanyuan.gof.behavior.command;

/**
 * @Description ConcreteCommand具体命令类
 * @Author yanyuan
 * @Date 11:59 2020/4/11
 * @Version 1.0
 **/
public class AddCommand extends Command {

    @Override
    public int execute(int value) {
        super.memoryValue = value;
        return super.receiver.add(value);
    }

    @Override
    public int reset() {
        return super.receiver.subtract(memoryValue);
    }
}
