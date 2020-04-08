package com.yanyuan.gof.structural.composite;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 组合模式测试类
 * @Author yanyuan
 * @Date 23:07 2020/4/8
 * @Version 1.0
 **/
@Slf4j
public class Test {

    public static void main(String[] args){
        CS cs = new CS("CS");
        Dota dota = new Dota("Dota");
        Lol lol = new Lol("英雄联盟");

        GameStore gameStore = new GameStore("全部游戏");
        gameStore.add(cs);


        GameStore competitiveGameStore = new GameStore("竞技游戏");
        competitiveGameStore.add(dota);
        competitiveGameStore.add(lol);
//        competitiveGameStore.remove(lol);
        gameStore.add(competitiveGameStore);

        //展示全部游戏
        log.info("展示全部游戏中。。。");
        gameStore.display();


        log.info("展示竞技游戏中。。。");
        competitiveGameStore.display();
    }
}
