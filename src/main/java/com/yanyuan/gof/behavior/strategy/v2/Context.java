package com.yanyuan.gof.behavior.strategy.v2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: yanyuan
 * @Date: 2020/7/7 15:35
 * @Description:
 */
public class Context {

    public static Map<String, Discount> strategyMap = new ConcurrentHashMap<>();

    static {
        for (DiscountType discountType: DiscountType.values()){
            try {
                //基于反射创建全部折扣算法类
                strategyMap.put(discountType.toString(), (Discount) Class.forName(discountType.getClassName()).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    //计算折扣
    public static double discountPrice(String type, Double originalPrice){
        return strategyMap.get(type).discountPrice(originalPrice);
    }

    //计算折扣
    public static double discountPrice(DiscountType type, Double originalPrice){
        return discountPrice(type.toString(), originalPrice);
    }
}
