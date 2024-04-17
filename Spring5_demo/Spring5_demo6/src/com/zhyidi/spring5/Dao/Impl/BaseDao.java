package com.zhyidi.spring5.Dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Description:BaseDao类
 * @Author zhyidi
 * @Date: 2022/5/13 15:58
 * @Version 1.0
 */
public class BaseDao {

    @Autowired
    @Qualifier(value = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    /**
     * @Description: 执行Insert/Update/Delete操作
     * @Author zhyidi
     * @Param
     * @return
     * @Date 18:02 2022/5/6
     **/
    public int update(String sql,Object ...args){
        return jdbcTemplate.update(sql, args);
    }

    /**
     * @Description: 查询返回一个javabean
     * @Author zhyidi
     * @Param
     * @return
     * @Date 18:14 2022/5/6
     **/
    public <T> T queryForOne(Class<T> tClass,String sql,Object ...args){
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<T>(tClass),args);
    }
    /**
     * @Description: 查询返回一个List集合的javabean
     * @Author zhyidi
     * @Param
     * @return
     * @Date 10:02 2022/5/7
     **/
    public <T> List<T> queryForList(Class<T> tClass, String sql, Object ...args){
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<T>(tClass),args);
    }

    /**查询返回一行一列的sql
     * @Description: 执行的sql
     * @Author zhyidi
     * @Param
     * @return
     * @Date 10:04 2022/5/7
     **/
    public <T> T queryForValue(Class<T> tClass,String sql,Object ...args){
        return jdbcTemplate.queryForObject(sql,tClass,args);
    }

    /**
     * @Description: 批量insert/delete/update
     * @Author zhyidi
     * @Param
     * @return
     * @Date 22:59 2022/5/13
     **/
    public int[] batchUpdate(String sql, List<Object[]> batchArgs){
        return jdbcTemplate.batchUpdate(sql, batchArgs);
    }
}
