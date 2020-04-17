package com.yanyuan.gof.behavior.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description Concrete State具体状态类
 * 预定房间
 * @Author yanyuan
 * @Date 22:54 2020/4/16
 * @Version 1.0
 **/
@Slf4j
public class ReservationState implements State {

    Room room;

    public ReservationState(Room room) {
        this.room = room;
    }

    @Override
    public void reservationRoom() {
        log.error("预定失败，该房间已经被预定");
    }

    @Override
    public void unsubscribeRoom() {
        log.info("您已经取消预定");
        room.setState(room.freeState);
    }

    @Override
    public void checkinRoom() {
        log.info("您已入住成功");
        room.setState(room.checkinState);

    }

    @Override
    public void checkoutRoom() {

    }
}
