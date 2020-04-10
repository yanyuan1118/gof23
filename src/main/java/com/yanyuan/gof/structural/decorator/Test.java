package com.yanyuan.gof.structural.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description TODO
 * @Author yanyuan
 * @Date 15:18 2020/4/9
 * @Version 1.0
 **/
@Slf4j
public class Test {

    public static void main(String[] args) {
        Cake cake = new CakeImpl();
        log.info("小红想吃{}, 价格：￥{}", cake.nameDetail(), cake.price());

        CakeDecorator cakeEgg = new EggCakeDecorator(cake);
        log.info("小明想吃{}, 价格：￥{}", cakeEgg.nameDetail(), cakeEgg.price());


        //它标识我们制作顺序，在生产中严格把控制作流程
        CakeDecorator meetCake = new MeetCakeDecorator(cakeEgg);
        CakeDecorator veggCake = new VeggCakeDecorator(meetCake);
        log.info("小张想吃{}, 价格：￥{}", veggCake.nameDetail(), veggCake.price());

    }

}
