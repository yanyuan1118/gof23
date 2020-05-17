package com.yanyuan.gof.behavior.command.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 计算
 * @Author yanyuan
 * @Date 22:13 2020/5/12
 * @Version 1.0
 **/
@Slf4j
public class CalcInvoker {
    private CalcEnum calcEnum;

    public CalcInvoker(CalcEnum calcEnum) {
        this.calcEnum = calcEnum;
    }

    public void setCalcEnum(CalcEnum calcEnum) {
        this.calcEnum = calcEnum;
    }
    public void calc(int value){
        int result = calcEnum.execute(value);
        log.info("计算操作：执行结果： {} ", result);
    }

    public void cancel(){
        int result = calcEnum.reset();
        log.info("撤销操作，执行结果：{}", result);
    }
}
