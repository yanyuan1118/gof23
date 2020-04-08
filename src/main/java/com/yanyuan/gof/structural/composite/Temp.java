package com.yanyuan.gof.structural.composite;

import java.util.HashMap;

/**
 * @Description 组合模式临时参考类
 * @Author yanyuan
 * @Date 22:50 2020/4/8
 * @Version 1.0
 **/
public class Temp {

    public static void main(String[] args){
        HashMap<String, Object> mapStudent = new HashMap<String, Object>();
        mapStudent.put("name", "张三");
        mapStudent.put("age", 11);

        HashMap<String, Object> map = new HashMap<String, Object>();
        //map类用到了组合模式
        //putAll方法并没有针对考虑key, value的类型
        map.putAll(mapStudent);


    }
}
