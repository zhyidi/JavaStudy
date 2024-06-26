package com.zhyidi.ssm.dao;

import com.zhyidi.ssm.bean.Department;
import com.zhyidi.ssm.bean.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    long countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Integer deptId);

    int insert(Department row);

    int insertSelective(Department row);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(Integer deptId);

    int updateByExampleSelective(@Param("row") Department row, @Param("example") DepartmentExample example);

    int updateByExample(@Param("row") Department row, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department row);

    int updateByPrimaryKey(Department row);
}