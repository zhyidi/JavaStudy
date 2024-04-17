package com.zhyidi.book.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.DbUtils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Description:JDBC工具类
 * @Author zhyidi
 * @Date: 2022/5/6 17:27
 * @Version 1.0
 */
public class JdbcUtils {
    // 数据库连接池
    private static DruidDataSource dataSource;
    // 初始化数据库连接池
    static{
        Properties properties = new Properties();
        InputStream resourceAsStream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        try {
            properties.load(resourceAsStream);
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * @Description: 获得数据库连接池中的一个连接
     * @Param
     * @return
     * @Author zhyidi
     * @Date 17:27 2022/5/6
     **/
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    /**
     * @Description: 关闭数据库连接
     * @Author zhyidi
     * @Param
     * @return
     * @Date 17:59 2022/5/6
     **/
    public static void close(Connection conn){
        DbUtils.closeQuietly(conn);
    }
}
