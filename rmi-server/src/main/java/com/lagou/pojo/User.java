package com.lagou.pojo;

import java.io.Serializable;

/*
    网络传输 二进制流
    引用对象应该实现序列化接口,这样才能在远程调用的时候实现序列化和反序列化
 */
public class User  implements Serializable {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
