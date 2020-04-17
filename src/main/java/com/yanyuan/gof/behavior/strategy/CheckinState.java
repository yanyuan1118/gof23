package com.yanyuan.gof.behavior.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description Concrete State具体状态类
 * 入住房间
 * @Author yanyuan
 * @Date 22:54 2020/4/16
 * @Version 1.0
 **/
@Slf4j
public class CheckinState implements State {

    Room room;

    public CheckinState(Room room) {
        this.room = room;
    }

    @Override
    public void reservationRoom() {
        log.error("预定失败，该房间已经入住");
    }

    @Override
    public void unsubscribeRoom() {

    }

    @Override
    public void checkinRoom() {
        log.error("入住失败，该房间已经入住");

    }

    @Override
    public void checkoutRoom() {
        log.info("您已退房");
        room.setState(room.freeState);
    }
}
