package com.yanyuan.gof.behavior.vistor;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description Concrete Vistor
 * 财务人员：（查看每一笔收入细节）
 * @Author yanyuan
 * @Date 14:14 2020/4/18
 * @Version 1.0
 **/
@Slf4j
public class FinanceVistor implements Vistor {

    @Override
    public void view(ExpenseBillElement expenseBillElement) {
        log.info("财务查看支出栏目 ： {} , 支出金额：{}", expenseBillElement.getItem(), expenseBillElement.getAmount());
    }

    @Override
    public void view(IncomeBillElement incomeBillElement) {
        log.info("财务查看收入栏目 ： {} , 支出金额：{}", incomeBillElement.getItem(), incomeBillElement.getAmount());

    }
}
