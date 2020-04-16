package com.yanyuan.gof.behavior.observe;

import javax.xml.ws.WebEndpoint;

/**
 * @Description 观察者测试类
 * @Author yanyuan
 * @Date 10:42 2020/4/16
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        Observe observe = new ConcreteObserve(weatherSubject);

        weatherSubject.setWeather(new Weather("2020-4-16 12:00",24, 50, 2));
        weatherSubject.setWeather(new Weather("2020-4-16 14:00", 25, 40, 1));
        weatherSubject.setWeather(new Weather("2020-4-16 16:00",20, 70, 3));

        weatherSubject.removeObserve(observe);
        weatherSubject.setWeather(new Weather("2020-4-16 18:00",15, 65, 1));

    }
}
