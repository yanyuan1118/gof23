package com.yanyuan.gof.behavior.command.v2;

/**
 * @Description 命令类
 * @Author yanyuan
 * @Date 22:06 2020/5/12
 * @Version 1.0
 **/
public enum CalcEnum {
    //ConcreteCommand具体命令类
    ADD("加法"){
        @Override
        public int execute(int value) {
            super.memoryValue = value;
            return super.receiver.add(value);
        }

        @Override
        public int reset() {
            //减去记忆数值
            return super.receiver.subtract(super.memoryValue);
        }
    },
    //ConcreteCommand具体命令类
    MULTI("乘法"){
        @Override
        public int execute(int value) {
            super.memoryValue = value;
            return super.receiver.multi(value);
        }

        @Override
        public int reset() {
            return super.receiver.division(super.memoryValue);
        }
    };

    CalcEnum(String name) {
        this.name = name;
    }

    private String name;

    public abstract int execute(int value);
    public abstract int reset();
    int memoryValue;
    final static CalcReceiver receiver = new CalcReceiver();
}
