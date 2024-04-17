package com.zhyidi.spring5.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/11 20:12
 * @Version 1.0
 */
//完全注解开发，替代xml文件
@Configuration
@ComponentScan(basePackages = "com.zhyidi.spring5")
public class SpringConfig {
}
