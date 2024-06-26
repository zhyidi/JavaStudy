package com.zhyidi.mybatis.mapper;

import com.zhyidi.mybatis.pojo.Dept;
import com.zhyidi.mybatis.pojo.DeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    long countByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    int deleteByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    int deleteByPrimaryKey(Integer did);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    int insert(Dept row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    int insertSelective(Dept row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    List<Dept> selectByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    Dept selectByPrimaryKey(Integer did);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    int updateByExampleSelective(@Param("row") Dept row, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    int updateByExample(@Param("row") Dept row, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    int updateByPrimaryKeySelective(Dept row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbg.generated Sat May 28 10:05:05 CST 2022
     */
    int updateByPrimaryKey(Dept row);
}