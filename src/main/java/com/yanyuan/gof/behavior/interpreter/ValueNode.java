package com.yanyuan.gof.behavior.interpreter;

/**
 * @Description 终结解释器类， 返回最终的值
 * @Author yanyuan
 * @Date 10:12 2020/4/13
 * @Version 1.0
 **/
public class ValueNode implements Node {

    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpreter() {
        return this.value;
    }
}
