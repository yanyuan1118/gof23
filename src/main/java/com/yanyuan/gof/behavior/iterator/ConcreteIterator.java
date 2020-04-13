package com.yanyuan.gof.behavior.iterator;

/**
 * @Description 具体的迭代器
 * @Author yanyuan
 * @Date 23:19 2020/4/13
 * @Version 1.0
 **/
public class ConcreteIterator implements Iterator {

    //迭代器是为了对容器角色遍历，具体的迭代器需要关联容器角色
    private Aggregate aggregate;
    private int index;

    public ConcreteIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        if(index >= aggregate.getSize()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object object  = aggregate.get(index);
        index++;
        return object;
    }
}
