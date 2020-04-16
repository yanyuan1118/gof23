package com.yanyuan.gof.behavior.observe;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 具体观察者
 * @Author yanyuan
 * @Date 10:36 2020/4/16
 * @Version 1.0
 **/
@Slf4j
public class AppClientObserve implements Observe {

    private Subject weatherSubject;

    //注册观察者, 关联主题
    public AppClientObserve(Subject weatherSubject) {
        this.weatherSubject = weatherSubject;
        this.weatherSubject.registerObserve(this);
    }


    @Override
    public String name() {
        return "App客户端";
    }

    @Override
    public void update(Weather weather) {
        log.info("APP客户端：{} 最新天气：温度 {} ℃, 相对湿度 {} %, 风力 {} 级",
                weather.getDate(), weather.getTemperature(), weather.getHumidity(), weather.getWindPower());
    }
}
