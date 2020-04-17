package com.yanyuan.gof.behavior.state;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description Context类
 * 房间
 *
 * 状态模式特点一、除了关联抽象状态，还需要关联我们具体状态
 *
 * 状态模式特点二、对于环境类，我们需要记住以下事项，
 * 提供所有的抽象与具体的状态类。并且在无参构造方法初始化状态类
 * 还需要提供所有属性的set方法，供状态类使用，需要提供调用状态类的方法
 *
 * @Author yanyuan
 * @Date 22:52 2020/4/16
 * @Version 1.0
 **/
@Slf4j
public class Room{
    State state;

    /**
     * 状态模式特点一、除了关联抽象状态，还需要关联我们具体状态
     */
    State freeState;
    State reservationState;
    State checkinState;

    //初始化全部状态，且绑定关系
    public Room() {
        freeState = new FreeState(this);
        reservationState = new ReservationState(this);
        checkinState = new CheckinState(this);
        state = freeState;
    }

    public void setState(State state) {
        this.state = state;
    }


    /**
     * 核心方法
     * @return
     */
    public State getState() {
        return state;
    }

    public void setFreeState(State freeState) {
        this.freeState = freeState;
    }



    public void setReservationState(State reservationState) {
        this.reservationState = reservationState;
    }



    public void setCheckinState(State checkinState) {
        this.checkinState = checkinState;
    }

    public void reservationRoom() {
        state.reservationRoom();
    }

    public void unsubscribeRoom() {
        state.unsubscribeRoom();
    }

    public void checkinRoom() {
        state.checkinRoom();
    }

    public void checkoutRoom() {
        state.checkoutRoom();
    }


    public void showCurrState(){
        log.info("当前房间状态 {}", this.state.getClass().getSimpleName());
    }


}
