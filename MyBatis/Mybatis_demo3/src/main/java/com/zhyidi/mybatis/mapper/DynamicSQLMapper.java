package com.zhyidi.mybatis.mapper;

import com.zhyidi.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/24 16:15
 * @Version 1.0
 */
public interface DynamicSQLMapper {

    /**
     * @Description: 多条件查询
     * @Author zhyidi
     * @Param
     * @return
     * @Date 16:15 2022/5/24
     **/
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * @Description: 测试choose/when/otherwise
     * @Author zhyidi
     * @Param
     * @return
     * @Date 16:43 2022/5/24
     **/
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * @Description: 根据数组进行批量删除
     * @Author zhyidi
     * @Param
     * @return
     * @Date 16:55 2022/5/24
     **/
    int deleteMoreByArray(@Param("eids") Integer[] eids);

    /**
     * @Description: 根据List进行批量添加
     * @Author zhyidi
     * @Param
     * @return
     * @Date 17:04 2022/5/24
     **/
    int insertMoreByList(@Param("emps") List<Emp> emps);
}
