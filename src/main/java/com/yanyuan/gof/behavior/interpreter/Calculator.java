package com.yanyuan.gof.behavior.interpreter;

import java.util.Stack;

/**
 * @Description 结合Context类，并为客户端提供统一调用接口
 * @Author yanyuan
 * @Date 10:34 2020/4/13
 * @Version 1.0
 **/
public class Calculator {

    private Node node;

    private String statement;

    public void build(String statement){
        Node left = null;
        Node right = null;
        Stack stack = new Stack();//提供环境，存储一些关系
        //重点，将node存入stack, 存储前需确认表达式的顺序和执行结果
        //以空格分隔
        String[] statementArr = statement.split(" ");
        int index = 0;
        int value;
        for (String state : statementArr){
            index++;
            switch (state){
                case "*" ://乘法
                    left = (Node)stack.pop();
                    value = Integer.parseInt(statementArr[index]);
                    right = new ValueNode(value);
                    stack.push(new MulNode(left, right));
                    break;

                case "/" : //除法
                    left = (Node)stack.pop();
                    value = Integer.parseInt(statementArr[index]);
                    right = new ValueNode(value);
                    stack.push(new DivisionNode(left, right));
                    break;

                case "%" : //取模
                    left = (Node)stack.pop();
                    value = Integer.parseInt(statementArr[index]);
                    right = new ValueNode(value);
                    stack.push(new ModNode(left, right));
                    break;

                case "+" : //加法
                    left = (Node)stack.pop();
                    value = Integer.parseInt(statementArr[index]);
                    right = new ValueNode(value);
                    stack.push(new AddNode(left, right));
                    break;

                case "-" : //减法
                    left = (Node)stack.pop();
                    value = Integer.parseInt(statementArr[index]);
                    right = new ValueNode(value);
                    stack.push(new SubtractNode(left, right));
                    break;

                default:
                    stack.push(new ValueNode(Integer.parseInt(state)));
                    break;
            }

        }
        //stack pop显示栈顶元素并且移除栈顶元素
        this.node = (Node) stack.pop();
    }

    public int compute(){
        return node.interpreter();
    }

}
