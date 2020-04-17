package com.yanyuan.gof.behavior.state;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description Concrete State具体状态类
 * 空闲房间
 * @Author yanyuan
 * @Date 22:54 2020/4/16
 * @Version 1.0
 **/
@Slf4j
public class FreeState implements State{

    Room room;

    public FreeState(Room room) {
        this.room = room;
    }

    /**
     * 房间状态改变，还需修改内部状态
     */
    @Override
    public void reservationRoom() {
        log.info("您已预定房间");
        room.setState(room.reservationState);
    }

    @Override
    public void unsubscribeRoom() {

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
