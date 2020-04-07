package com.yanyuan.gof.build.abstractFactory;

/**
 * @Description TODO
 * @Author yanyuan
 * @Date 19:46 2020/4/5
 * @Version 1.0
 **/
public class Store {

    public static void consume(String typeFood, String typePizza, String type){
        if("PIZZA".equals(typeFood)){
            if (type.equals("COLD")){
                if(typePizza.equals("VEGG")){
                    ClodFoodFactory clodFoodFactory = new ClodFoodFactory();
                    clodFoodFactory.createPizza("VEGG");
                }
            }else if(type.equals("HOT")){
                if(typePizza.equals("VEGG")){
                    HotFoodFactory hotFoodFactory = new HotFoodFactory();
                    hotFoodFactory.createPizza("VEGG");
                }
            }
        }
    }

    public static void main(String[] args){
        Store.consume("PIZZA", "VEGG", "HOT");
    }
}
