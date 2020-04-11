package com.yanyuan.gof.behavior.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description ConcreteHandler实现类
 * CEO 批准5天及以下
 * 职责链上的一个具体处理者
 * @Author yanyuan
 * @Date 23:58 2020/4/10
 * @Version 1.0
 **/
@Slf4j
public class CEOLeader extends Leader{

    public CEOLeader(String position) {
        super(position);
    }

    @Override
    public void process(LeaveRequest leaveRequest) {
        if(leaveRequest.getDays() <= 5){
            log.info("请假单：姓名{}, 请假天数: {} , 原因：{}",
                    leaveRequest.getName(),
                    leaveRequest.getDays() ,
                    leaveRequest.getReason());
            log.info("CEO批准: 同意");
        }else if(leaveRequest.getDays() > 5){
            if(nextLeader == null){
                log.info("该请假单不能被批准：{} ", leaveRequest);
                return;
            }
            nextLeader.process(leaveRequest);
        }
    }
}
