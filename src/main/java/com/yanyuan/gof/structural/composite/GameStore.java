package com.yanyuan.gof.structural.composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 容器
 * 存储管理抽象对象
 * @Author yanyuan
 * @Date 23:02 2020/4/8
 * @Version 1.0
 **/
@Slf4j
public class GameStore extends Game{

    List<Game> gameList = null;

    public GameStore(String name) {
        super(name);
        gameList = new ArrayList<>();
    }

    /**
     * 展示游戏
     */
    public void display() {
        for (Game game: gameList){
            game.display();
        }
    }

    public void add(Game game){
        gameList.add(game);
    }

    public void remove(Game game){
        gameList.remove(game);
    }
}
