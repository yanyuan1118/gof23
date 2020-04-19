package com.yanyuan.gof.build.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 单例测试类
 * @Author yanyuan
 * @Date 22:33 2020/4/19
 * @Version 1.0
 **/
@Slf4j
public class Test {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        log.info(lazySingleton.toString());
    }
}
