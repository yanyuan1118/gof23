package com.yanyuan.gof.build.prototype;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 测试类
 * @Author yanyuan
 * @Date 14:13 2020/4/7
 * @Version 1.0
 **/
@Slf4j
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Student stu = new Student();
        stu.setName("学生姓名");
        stu.setAge(18);
        List<String> friends = new ArrayList();
        friends.add("张三");
        friends.add("李四");
        stu.setFriends(friends);
        School school = new School();
        school.setName("剑桥大学");
        stu.setSchool(school);

//        Student cloneObj = stu.clone();
        Student cloneObj = stu.deepClone();
        cloneObj.setName("克隆人");
        cloneObj.getSchool().setName("家里蹲大学");
        cloneObj.getFriends().add("复制学生");
        log.info("stu : {} ", stu);
        log.info("cloneObj : {}", cloneObj);
    }
}
