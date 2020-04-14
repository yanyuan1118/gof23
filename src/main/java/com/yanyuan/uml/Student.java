package com.yanyuan.uml;

/**
 * @Description 学生
 *
 * 继承Person, 实现ICareer
 * @Author yanyuan
 * @Date 13:01 2020/4/4
 * @Version 1.0
 **/
public class Student extends Person implements ICareer {

    /**
     * 依赖
     */
    public PoliceMan policeMan;

    /**
     * 单向关联
     */
    public Home home;

    /**
     * 双向关联
     */
    public Teacher teacher;

    /**
     * 组合关系
     */
    public Hand hand;


    public Student() {
    }

    public Student(Home home, Teacher teacher) {
        this.home = home;
        this.teacher = teacher;
    }

    public Student(PoliceMan policeMan, Home home, Teacher teacher) {
        this.policeMan = policeMan;
        this.home = home;
        this.teacher = teacher;
    }

    public Student(Hand hand) {
        this.hand = hand;
    }

    public void career() {
        System.out.println("职位为：学生");
    }

    public void sendCoin(){
        policeMan.receiveCoin();
    }
}
