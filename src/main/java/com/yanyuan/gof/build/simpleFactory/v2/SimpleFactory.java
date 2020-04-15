package com.yanyuan.gof.build.simpleFactory.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description Factory 工厂角色类
 * @Author yanyuan
 * @Date 22:06 2020/4/14
 * @Version 1.0
 **/
@Slf4j
public class SimpleFactory {

    public Phone createPhone(String brand){
        Phone phone = null;
        switch (brand){
            case "HUAWEI":
                phone = new HuaweiPhone();
                break;
            case "IPHONE":
                phone = new IPhone();
                break;
            default:
                log.error("暂不支持该品牌手机");
                break;
        }
        return phone;
    }
}
