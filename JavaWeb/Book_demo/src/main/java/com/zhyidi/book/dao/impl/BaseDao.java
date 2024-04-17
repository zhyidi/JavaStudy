package com.zhyidi.book.dao.impl;


import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @Description:BaseDao类
 * @Author zhyidi
 * @Date: 2022/5/6 17:45
 * @Version 1.0
 */
public abstract class BaseDao {
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * @Description: 执行Insert/Update/Delete操作
     * @Author zhyidi
     * @Param
     * @return 返回-1说明执行失败，其他表示影响的行数
     * @Date 18:02 2022/5/6
     **/
    public int update(Connection conn,String sql,Object ...args){
        try {
            return queryRunner.update(conn,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    /**
     * @Description: 查询返回一个javabean
     * @Author zhyidi
     * @Param
     * @return 返回null说明执行失败
     * @Date 18:14 2022/5/6
     **/
    public <T> T queryForOne(Connection conn,Class<T> tClass,String sql,Object ...args){
        try {
            return queryRunner.query(conn,sql,new BeanHandler<T>(tClass),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
     /**
      * @Description: 查询返回一个List集合的javabean
      * @Author zhyidi
      * @Param
      * @return 返回null说明执行失败
      * @Date 10:02 2022/5/7
      **/
    public <T> List<T> queryForList(Connection conn,Class<T> tClass,String sql,Object ...args){
        try {
            return queryRunner.query(conn, sql, new BeanListHandler<T>(tClass), args);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**查询返回一行一列的sql
     * @Description: 执行的sql
     * @Author zhyidi
     * @Param
     * @return 返回null说明执行失败
     * @Date 10:04 2022/5/7
     **/
    public Object queryForValue(Connection conn,String sql,Object ...args){
        try {
            return queryRunner.query(conn, sql, new ScalarHandler<>(), args);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
