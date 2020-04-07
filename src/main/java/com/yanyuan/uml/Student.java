package com.yanyuan.uml;

/**
 * @Description 学生
 * @Author yanyuan
 * @Date 13:01 2020/4/4
 * @Version 1.0
 **/
public class Student extends Person implements ICareer {

    public PoliceMan policeMan;

    public Home home;

    public Teacher teacher;

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

    }

    public void sendCoin(){
        policeMan.receiveCoin();
    }
}
