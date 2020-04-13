package com.yanyuan.gof.behavior.interpreter;

/**
 * @Description 除法
 * @Author yanyuan
 * @Date 10:28 2020/4/13
 * @Version 1.0
 **/
public class DivisionNode extends SymbolNode {

    public DivisionNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return left.interpreter() / left.interpreter();
    }
}
