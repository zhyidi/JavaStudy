package com.zhyidi.spring5.Beans;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 15:11
 * @Version 1.0
 */
public class Employee {
    private String ename;
    private String gender;
    private Department dep;

    public String getEname() {
        return ename;
    }

    public String getGender() {
        return gender;
    }

    public Department getDep() {
        return dep;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dep=" + dep +
                '}';
    }

    public void add(){
        System.out.println("Emp.add...");
        this.getDep().add();
    }
}
