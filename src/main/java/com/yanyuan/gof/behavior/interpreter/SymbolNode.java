package com.yanyuan.gof.behavior.interpreter;

/**
 * @Description 非终结解释器（例如：加减乘除）
 * @Author yanyuan
 * @Date 10:19 2020/4/13
 * @Version 1.0
 **/
public class SymbolNode implements Node{

    Node left;
    Node right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter() {
        return 0;
    }
}
