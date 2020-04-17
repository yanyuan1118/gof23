package com.yanyuan.gof.behavior.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 模板模式测试类
 * @Author yanyuan
 * @Date 16:19 2020/4/17
 * @Version 1.0
 **/
@Slf4j
public class Test {
    public static void main(String[] args) {
        Drink coffee = new CoffeeDrink();
        log.info("泡咖啡-----> ");
        coffee.mark();
        log.info("开始泡茶-----> ");
        Drink tea = new TeaDrink();
        tea.mark();
    }
}
