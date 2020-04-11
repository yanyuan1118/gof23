package com.yanyuan.gof.behavior.chain;

/**
 * @Description Handler 抽象类
 * @Author yanyuan
 *
 * LeaveRequest是handler/process方法的处理对象
 *
 * @Date 23:42 2020/4/10
 * @Version 1.0
 **/
public abstract class Leader {

    private String position;//职业

    Leader nextLeader;//下一节点审核人员

    public Leader(String position) {
        super();
        this.position = position;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    //处理请求
    public abstract void process(LeaveRequest leaveRequest);
}
