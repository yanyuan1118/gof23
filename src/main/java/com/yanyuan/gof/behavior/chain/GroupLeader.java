package com.yanyuan.gof.behavior.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description ConcreteHandler实现类
 * 组长 批准1天及以下假期
 * @Author yanyuan
 * @Date 23:51 2020/4/10
 * @Version 1.0
 **/
@Slf4j
public class GroupLeader extends Leader {

    public GroupLeader(String position) {
        super(position);
    }

    @Override
    public void process(LeaveRequest leaveRequest) {
        if(leaveRequest.getDays() <= 1){
            log.info("请假单：姓名{}, 请假天数: {} , 原因：{}",
                    leaveRequest.getName(),
                    leaveRequest.getDays() ,
                    leaveRequest.getReason());
            log.info("组长批准: 同意");
        }else {
            if(nextLeader == null){
                log.info("该请假单不能被批准：{} ", leaveRequest);
            }
            nextLeader.process(leaveRequest);
        }
    }
}
