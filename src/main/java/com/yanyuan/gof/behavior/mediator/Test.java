package com.yanyuan.gof.behavior.mediator;

/**
 * @Description 中介者模式测试类
 * @Author yanyuan
 * @Date 10:34 2020/4/14
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Seller seller = new Seller("宋江", mediator);
        Buyer buyer = new Buyer("矮脚虎", mediator);

        mediator.setSeller(seller);
        mediator.setBuyer(buyer);

        seller.contact("我有三十套房, 打算卖10套");
        buyer.contact("我要买套房, 打算买1套");
    }
}
