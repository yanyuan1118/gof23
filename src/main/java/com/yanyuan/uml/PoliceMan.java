package com.yanyuan.uml;

/**
 * @Description 警察
 * @Author yanyuan
 * @Date 13:00 2020/4/4
 * @Version 1.0
 **/
public class PoliceMan extends Person implements ICareer {

    private Uniform uniform;

    public PoliceMan(Uniform uniform) {
        this.uniform = uniform;
    }

    public void career() {

    }

    void receiveCoin(){

    }
}
