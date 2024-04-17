package com.zhyidi.spring5.autowrite;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 17:31
 * @Version 1.0
 */
public class Emp {
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public Emp() {
    }

    public Emp(Dept dept) {
        this.dept = dept;
    }
}
