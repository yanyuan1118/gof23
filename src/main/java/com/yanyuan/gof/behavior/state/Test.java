package com.yanyuan.gof.behavior.state;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description 状态模式测试类
 * @Author yanyuan
 * @Date 22:43 2020/4/16
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Room[] rooms = new Room[]{new Room(), new Room()};
        rooms[0].reservationRoom();
        rooms[0].showCurrState();

        rooms[0].checkinRoom();
        rooms[0].showCurrState();

        rooms[0].checkoutRoom();
        rooms[0].showCurrState();

        rooms[1].reservationRoom();
        rooms[1].showCurrState();
        rooms[1].reservationRoom();
    }
}

