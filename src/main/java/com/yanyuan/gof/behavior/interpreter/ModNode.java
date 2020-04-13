package com.yanyuan.gof.behavior.interpreter;

/**
 * @Description 取模
 * @Author yanyuan
 * @Date 10:26 2020/4/13
 * @Version 1.0
 **/
public class ModNode extends SymbolNode {

    public ModNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpreter() {
        return left.interpreter() % right.interpreter();
    }
}
