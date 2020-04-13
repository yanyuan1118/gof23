package com.yanyuan.gof.behavior.interpreter;

/**
 * @Description 乘法
 * @Author yanyuan
 * @Date 10:26 2020/4/13
 * @Version 1.0
 **/
public class MulNode extends SymbolNode {

    public MulNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return left.interpreter() * right.interpreter();
    }
}
