package com.yanyuan.gof.behavior.observe;

import lombok.Data;

/**
 * @Description 天气
 * @Author yanyuan
 * @Date 10:25 2020/4/16
 * @Version 1.0
 **/
@Data
public class Weather {

    private String date;
    private int temperature;
    private int humidity;
    private int windPower;

    public Weather(String date, int temperature, int humidity, int windPower) {
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windPower = windPower;
    }
}
