package com.zhyidi.mybatis.mapper;

import com.zhyidi.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    /**
     * @Description: 根据eid查询emp
     * @Author zhyidi
     * @Param
     * @return
     * @Date 16:28 2022/5/27
     **/
    Emp getEmpByEid(@Param("eid") Integer eid);

    /**
     * @Description: 插入emp
     * @Author zhyidi
     * @Param
     * @return
     * @Date 16:29 2022/5/27
     **/
    int insertEmp(Emp emp);
}
