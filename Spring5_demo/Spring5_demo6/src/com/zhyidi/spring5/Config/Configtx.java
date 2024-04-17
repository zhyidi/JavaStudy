package com.zhyidi.spring5.Config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/14 11:17
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.zhyidi.spring5")
@EnableTransactionManagement    //开启事务注解
//开启事务时不需要选择事务管理器（自动选下方可用的DataSourceTransactionManager类型Bean）
//如果有多个事务管理器，会报错，此时如果必须使用两个事务处理器，为了方便就用xml配置。
public class Configtx {
    @Bean(name = "dataSource")
    public DruidDataSource getDruidDataSource(){
        Properties properties = new Properties();
        InputStream resourceAsStream = Configtx.class.getClassLoader().getResourceAsStream("jdbc.properties");
        try {
            properties.load(resourceAsStream);
            DruidDataSource dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
            return dataSource;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean(name = "jdbcTemplate")
    //参数里面也可以用注解来指明所用的DataSource是哪个。
    public JdbcTemplate getJdbcTemplate(@Qualifier(value = "dataSource") DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean(name = "dataSourceTransactionManager")
    public DataSourceTransactionManager getDataSourceTransactionManager(@Qualifier(value = "dataSource") DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

}
