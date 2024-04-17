package com.zhyidi.spring5.collectionType;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 15:49
 * @Version 1.0
 */
public class Course {
    private String Cname;

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Cname='" + Cname + '\'' +
                '}';
    }
}
