package com.yanyuan.gof.behavior.iterator;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @Description 具体容器对象
 * @Author yanyuan
 * @Date 23:25 2020/4/13
 * @Version 1.0
 **/
@Slf4j
public class ConcreteAggregate implements Aggregate {

    private Object[] arr;
    private int size;
    private int index;
    //数据长度
    private int ARRAY_LENGTH;

    public ConcreteAggregate() {
        size = 0;
        index = 0;
        ARRAY_LENGTH = 10;
        arr = new Object[ARRAY_LENGTH];
    }

    @Override
    public void add(Object object) {
        arr[index++] = object;
        size++;
        grow();
    }

    private void grow() {
        double percent = new BigDecimal(size).divide(new BigDecimal(ARRAY_LENGTH)).doubleValue();
        if(percent > 0.8){
            ARRAY_LENGTH *= 2;
            if(ARRAY_LENGTH > Integer.MAX_VALUE){
                ARRAY_LENGTH = Integer.MAX_VALUE;
            }
            Object[] newArr = new Object[ARRAY_LENGTH];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
    }

    @Override
    public Object get(int index) {
        return arr[index];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
}
