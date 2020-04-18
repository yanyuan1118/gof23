package com.yanyuan.gof.behavior.vistor;

/**
 * @Description 访问者模式
 * @Author yanyuan
 * @Date 15:24 2020/4/18
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        BillBook billBook = new BillBook();
        billBook.addBill(new ExpenseBillElement(1000d, "工资"));
        billBook.addBill(new ExpenseBillElement(2000d, "买材料"));

        billBook.addBill(new IncomeBillElement(3000d, "卖产品"));
        billBook.addBill(new IncomeBillElement(1000d, "做广告"));

        BossVistor bossVistor = new BossVistor();
        billBook.show(bossVistor);
        bossVistor.getTotalExpenses();
        bossVistor.getTotalIncome();

        FinanceVistor financeVistor = new FinanceVistor();
        billBook.show(financeVistor);

    }
}
