package com.yanyuan.gof.behavior.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description 负责人
 * 1、负责人保存备忘录
 * 2、负责人传递备忘录
 * 3、不能对备忘录内容操作/访问
 * @Author yanyuan
 * @Date 23:04 2020/4/15
 * @Version 1.0
 **/
@Setter
@Getter
public class Caretaker {

    Memento memento;



}
