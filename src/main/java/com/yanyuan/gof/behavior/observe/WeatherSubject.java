package com.yanyuan.gof.behavior.observe;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 具体主题
 * @Author yanyuan
 * @Date 10:27 2020/4/16
 * @Version 1.0
 **/
@Slf4j
public class WeatherSubject implements Subject {

    List<Observe> observes = new ArrayList<>();

    Weather weather;

    @Override
    public void registerObserve(Observe observe) {
        observes.add(observe);
    }

    @Override
    public void removeObserve(Observe observe) {
        observes.remove(observe);
    }

    @Override
    public void notifyAllObserve() {
        if(observes.isEmpty()){
            log.info("暂无观察者");
            return;
        }
        observes.stream().forEach((observe)->{
            observe.update(weather);
        });
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
        notifyAllObserve();
    }
}
