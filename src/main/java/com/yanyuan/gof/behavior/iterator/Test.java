package com.yanyuan.gof.behavior.iterator;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 迭代器模式
 * @Author yanyuan
 * @Date 23:38 2020/4/13
 * @Version 1.0
 **/
@Slf4j
public class Test {
    public static void main(String[] args) {

        Aggregate aggregate = new ConcreteAggregate();
        for (int i = 0; i < 100; i++){
            aggregate.add("宋江");
            aggregate.add("武松");
            aggregate.add("鲁智深");
            aggregate.add("燕青");
        }

        Iterator iterator = aggregate.iterator();
        log.info("{}", aggregate.getSize());
        //无须暴露内部表示
        while (iterator.hasNext()){
            log.info("{}", iterator.next());
        }

        List<String> list = new ArrayList();
        list.add("宋江");
        list.add("武松");
        list.add("林冲");
        java.util.Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()){
            log.info("java iterator {}", listIterator.next());
        }


    }
}
