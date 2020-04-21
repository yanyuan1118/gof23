package com.yanyuan.gof.build.prototype;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
        stu.setName("曹操");
        stu.setAge(18);
        List<String> friends = new ArrayList<>();
        friends.addAll(Arrays.asList("小乔", "大乔"));
        stu.setFriends(friends);
        School school = new School();
        school.setName("王者学校");
        stu.setSchool(school);

//        Student cloneObj = stu.clone(); //浅克隆
        Student cloneObj = stu.deepClone();//深克隆
        cloneObj.setName("克隆曹操");
        cloneObj.getSchool().setName("克隆王者学校");
        cloneObj.getFriends().add("复制大乔");
        log.info("stu : {} ", stu);
        log.info("cloneObj : {}", cloneObj);
    }
}
