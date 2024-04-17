package com.zhyidi.spring5.Beans;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 15:09
 * @Version 1.0
 */
public class Department {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dname='" + dname + '\'' +
                '}';
    }

    public void add(){
        System.out.println("Dep.add...");
    }
}
