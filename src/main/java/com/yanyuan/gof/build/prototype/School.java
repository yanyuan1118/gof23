package com.yanyuan.gof.build.prototype;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description
 * @Author yanyuan
 * @Date 14:12 2020/4/7
 * @Version 1.0
 **/
@Getter
@Setter
public class School implements Cloneable, Serializable {
    private String name;

    //浅复制升级版使用
    @Override
    protected School clone() throws CloneNotSupportedException {
        return (School) super.clone();
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }
}
