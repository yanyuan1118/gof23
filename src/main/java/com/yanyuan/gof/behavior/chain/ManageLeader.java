package com.yanyuan.gof.behavior.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description ConcreteHandler实现类
 * 经理 批准3天以下
 * @Author yanyuan
 * @Date 23:58 2020/4/10
 * @Version 1.0
 **/
@Slf4j
public class ManageLeader extends Leader{

    public ManageLeader(String position) {
        super(position);
    }

    @Override
    public void process(LeaveRequest leaveRequest) {
        if(leaveRequest.getDays() <= 3){
            log.info("请假单：姓名{}, 请假天数: {} , 原因：{}",
                    leaveRequest.getName(),
                    leaveRequest.getDays() ,
                    leaveRequest.getReason());
            log.info("经理批准: 同意");
        }else if(leaveRequest.getDays() > 3){
            if(nextLeader == null){
                log.info("该请假单不能被批准：{} ", leaveRequest);
                return;
            }
            nextLeader.process(leaveRequest);
        }
    }
}
