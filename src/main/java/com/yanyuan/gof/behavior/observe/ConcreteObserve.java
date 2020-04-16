package com.yanyuan.gof.behavior.observe;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 具体观察者
 * @Author yanyuan
 * @Date 10:36 2020/4/16
 * @Version 1.0
 **/
@Slf4j
public class ConcreteObserve implements Observe {

    private Subject weatherSubject;

    //注册观察者, 关联主题
    public ConcreteObserve(Subject weatherSubject) {
        this.weatherSubject = weatherSubject;
        this.weatherSubject.registerObserve(this);
    }


    @Override
    public void update(Weather weather) {
        log.info("{} 最新天气：温度 {} ℃, 相对湿度 {} %, 风力 {} 级",
                weather.getDate(), weather.getTemperature(), weather.getHumidity(), weather.getWindPower());
    }
}
