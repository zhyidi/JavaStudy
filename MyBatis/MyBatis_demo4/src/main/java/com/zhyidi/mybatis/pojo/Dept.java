package com.zhyidi.mybatis.pojo;

public class Dept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.did
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    private Integer did;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dept.dept_name
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    private String deptName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.did
     *
     * @return the value of t_dept.did
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.did
     *
     * @param did the value for t_dept.did
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dept.dept_name
     *
     * @return the value of t_dept.dept_name
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dept.dept_name
     *
     * @param deptName the value for t_dept.dept_name
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Dept() {
    }

    public Dept(Integer did, String deptName) {
        this.did = did;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}