package com.yanyuan.gof.behavior.vistor;

/**
 * @Description 抽象访问者 Vistor
 * 访问者
 * vistor中方法的个数，直接对应元素具体类的子数
 * @Author yanyuan
 * @Date 14:03 2020/4/18
 * @Version 1.0
 **/
public interface Vistor {
    //支出账单
    void view(ExpenseBillElement expenseBillElement);

    //收入账单
    void view(IncomeBillElement incomeBillElement);
}
