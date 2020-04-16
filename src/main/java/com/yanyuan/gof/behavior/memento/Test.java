package com.yanyuan.gof.behavior.memento;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 备忘录模式测试类
 * @Author yanyuan
 * @Date 23:07 2020/4/15
 * @Version 1.0
 **/
@Slf4j
public class Test {
    public static void main(String[] args) {
        Role role = new Role(10, 90);
        log.info("第一关通关, 开始存档");
        role.display();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(role.createMemento());

        //继续闯关. 第二关BOSS
        log.info("继续闯关. 第二关BOSS");
        role.setLevel(15);
        role.setBlood(10);
        role.display();

        //恢复存档
        log.info("打不过BOSS, 恢复存档");
        role.restore(caretaker.getMemento());
        role.display();
    }
}
