package com.yuqn.entity;

import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;

public class Student implements Serializable {
//  序列化版本号
    private static final long serialVersionUID = -4701562482059378578L;

    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
