package com.yanyuan.gof.behavior.vistor;

/**
 * @Description Concrete Element
 * @Author yanyuan
 * @Date 14:07 2020/4/18
 * @Version 1.0
 **/
public class IncomeBillElement implements BillElement {

    double amount;
    String item;

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }

    public IncomeBillElement(double amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.view(this);
    }
}