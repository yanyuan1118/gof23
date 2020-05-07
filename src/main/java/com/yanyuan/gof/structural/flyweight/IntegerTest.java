package com.yanyuan.gof.structural.flyweight;

/**
 * @Description Java Integer享元测试类
 * @Author yanyuan
 * @Date 16:02 2020/4/30
 * @Version 1.0
 **/
public class IntegerTest {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(127);
        Integer b = Integer.valueOf(127);
        System.out.println("a == b : " + (a == b));//输出true

        Integer c = Integer.valueOf(128);
        Integer d = Integer.valueOf(128);
        System.out.println("c == d : " + (c == d)); //输出false
    }
}
