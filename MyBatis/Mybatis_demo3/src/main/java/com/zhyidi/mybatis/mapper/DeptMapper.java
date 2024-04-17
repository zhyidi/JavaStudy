package com.zhyidi.mybatis.mapper;

import com.zhyidi.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * @Description: 根据did查询部门
     * @Author zhyidi
     * @Param
     * @return
     * @Date 11:38 2022/5/24
     **/
    Dept getDeptByid(@Param("did") Integer did);

    /**
     * @Description: 根据查询部门和部门里所有的员工
     * @Author zhyidi
     * @Param
     * @return
     * @Date 15:41 2022/5/24
     **/
    Dept getDeptAndEmp(@Param("did") Integer did);
}
