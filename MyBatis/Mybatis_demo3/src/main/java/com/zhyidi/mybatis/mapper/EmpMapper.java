package com.zhyidi.mybatis.mapper;

import com.zhyidi.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/24 10:27
 * @Version 1.0
 */
public interface EmpMapper {
    /**
     * @Description: 查询所有的员工信息
     * @Author zhyidi
     * @Param
     * @return
     * @Date 10:27 2022/5/24
     **/
    List<Emp> getAllEmp();

    /**
     * @Description: 查询员工以及员工所对应的部门信息
     * @Author zhyidi
     * @Param
     * @return
     * @Date 11:02 2022/5/24
     **/
    Emp getEmpAndDept(@Param("eid") Integer eid);

    /**
     * @Description: 根据did返回一个部门的员工集合
     * @Author zhyidi
     * @Param
     * @return
     * @Date 16:01 2022/5/24
     **/
    List<Emp> getEmpsBydid(@Param("did") Integer did);
}
