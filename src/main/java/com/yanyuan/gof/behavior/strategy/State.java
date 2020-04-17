package com.yanyuan.gof.behavior.strategy;

/**
 * @Description TODO
 * @Author yanyuan
 * @Date 22:48 2020/4/16
 * @Version 1.0
 **/
public interface State {
    //预定房间
    void reservationRoom();
    //退订房间
    void unsubscribeRoom();
    //入住
    void checkinRoom();
    //退房
    void checkoutRoom();

}
