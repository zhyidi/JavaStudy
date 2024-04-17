package com.zhyidi.spring5.pojo;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/12 23:03
 * @Version 1.0
 */
public class User {
    private Integer id;
    private String username;
    private BigDecimal money;


    public User() {
    }

    public User(Integer id, String username, BigDecimal money) {
        this.id = id;
        this.username = username;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", money=" + money +
                '}';
    }
}
