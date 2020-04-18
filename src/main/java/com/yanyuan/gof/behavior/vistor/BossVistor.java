package com.yanyuan.gof.behavior.vistor;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description Concrete Vistor
 * 老板：（查看收入和支出总和）
 * @Author yanyuan
 * @Date 14:12 2020/4/18
 * @Version 1.0
 **/
@Slf4j
public class BossVistor implements Vistor {

    double totalExpenses;//总支出
    double totalIncome;//总收入

    public double getTotalExpenses() {
        log.info("老板查看总支出: {} RMB", this.totalExpenses);
        return totalExpenses;
    }

    public double getTotalIncome() {
        log.info("老板查看总收入: {} RMB", this.totalIncome);
        return totalIncome;
    }


    /**
     * 查看支出
     * @param expenseBillElement
     */
    @Override
    public void view(ExpenseBillElement expenseBillElement) {
        totalExpenses += expenseBillElement.getAmount();
    }

    /**
     * 查看收入
     * @param incomeBillElement
     */
    @Override
    public void view(IncomeBillElement incomeBillElement) {
        totalIncome += incomeBillElement.getAmount();
    }
}
