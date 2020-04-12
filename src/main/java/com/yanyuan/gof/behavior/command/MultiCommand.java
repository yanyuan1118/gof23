package com.yanyuan.gof.behavior.command;

/**
 * @Description ConcreteCommand具体命令类
 * @Author yanyuan
 * @Date 12:17 2020/4/11
 * @Version 1.0
 **/
public class MultiCommand extends Command{

    @Override
    public int execute(int value) {
        super.memoryValue = value;
        return this.receiver.multi(value);
    }

    @Override
    public int reset() {
        return receiver.division(super.memoryValue);
    }
}
