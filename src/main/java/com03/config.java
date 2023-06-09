package com03;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration  作为配置类，替代xml配置文件
//@ComponentScan  指定要扫描的路径(package)，如果为空则以@ComponentScan注解的类所在的包为基本的扫描路径
@Configuration
@ComponentScan(basePackages = "com02")
public class config {

}
