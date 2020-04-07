package com.yanyuan.gof.build.prototype;

import lombok.Data;
import lombok.SneakyThrows;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 学生
 * @Author yanyuan
 * @Date 14:11 2020/4/7
 * @Version 1.0
 **/
@Data
public class Student implements Cloneable, Serializable {
    private String name;
    private Integer age;

    private School school;
    private List<String> friends;

    @Override
    protected Student clone() throws CloneNotSupportedException {
        //浅克隆
//        return (Student) super.clone();

        //浅克隆升级
        Student student = (Student) super.clone();
        student.school = school.clone();
        List list = new ArrayList<String>();
        list.addAll(friends);
        student.friends = list;
        return student;
    }

    public Student deepClone() throws IOException, ClassNotFoundException {
        //深克隆 基于序列化，与cloneable无关
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);

        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        Student student = (Student) oi.readObject();
        return student;
    }
}
