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
        Room room = new Room();
        room.reservationRoom();
        room.showCurrState();

        room.checkinRoom();
        room.showCurrState();

        room.checkoutRoom();
        room.showCurrState();

    }
}

