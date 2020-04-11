package com.yanyuan.gof.behavior.chain;

/**
 * @Description 职责链测试类
 * @Author yanyuan
 * @Date 00:01 2020/4/11
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args){
        Leader groupLeader = new GroupLeader("组长");
        Leader manageLeader = new ManageLeader("经理");
        groupLeader.setNextLeader(manageLeader);

        Leader ceo = new CEOLeader("总经理");
        manageLeader.setNextLeader(ceo);

        LeaveRequest oneDay = new LeaveRequest("林冲", 1, "爬山");

        LeaveRequest threeDays = new LeaveRequest("吴用", 3, "回家相亲");
        LeaveRequest fiveDays = new LeaveRequest("武松", 5, "去打猎");
        LeaveRequest sixDays = new LeaveRequest("李逵", 7, "去旅行");

        groupLeader.process(oneDay);
        groupLeader.process(threeDays);
        groupLeader.process(fiveDays);
        groupLeader.process(sixDays);
    }
}
