package com.yanyuan.gof.behavior.chain;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description 请假单
 * @Author yanyuan
 * @Date 23:49 2020/4/10
 * @Version 1.0
 **/
@Getter
@Setter
public class LeaveRequest {

    private String name;
    private int days;
    private String reason;

    public LeaveRequest() {
    }

    public LeaveRequest(String name, int days, String reason) {
        this.name = name;
        this.days = days;
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "name='" + name + '\'' +
                ", days=" + days +
                ", reason='" + reason + '\'' +
                '}';
    }
}
