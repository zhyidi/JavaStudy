package com.zhyidi.spring5.Beans;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 10:49
 * @Version 1.0
 */
public class User {
    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void add(){
        System.out.println("add被"+this.name+"调用了...");
    }

}
