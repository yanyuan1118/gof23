package com.yanyuan.gof.behavior.command;

import com.oracle.tools.packager.Log;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description Invoker 调用者
 * @Author yanyuan
 * @Date 12:05 2020/4/11
 * @Version 1.0
 **/
@Slf4j
public class Invoker {

    //调用者发送命令, 所以需要将命令类关联进来
    Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void calc(int value){
        int result = command.execute(value);
        log.info("计算操作：执行结果： {} ", result);
    }

    public void cancel(){
        int result = command.reset();
        log.info("撤销操作，执行结果：{}", result);
    }
}
