package com.zhyidi.spring5.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/12 22:14
 * @Version 1.0
 */
@Configuration  //配置类的注解
@ComponentScan(basePackages = "com.zhyidi.spring5.Aopanno")     //开启组件扫描
@EnableAspectJAutoProxy //开启自动动态代理
public class ConfigAOP {
}
