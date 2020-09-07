package com.sinopac.springbootweb.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.sinopac.springbootweb.config.pojo.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * 功能描述:jdbc配置类<br>
 *
 * @author hp
 * @date 2020-09-05 15:57
 */
@Configuration
@EnableConfigurationProperties(JdbcProperties.class)// 指定加载配置属性类
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    /**
     * 通过@PropertySource注入参数创建数据源Druid
     * @return dataSource
     */
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClassName);

        return dataSource;
    }

    @Autowired
    private JdbcProperties jdbcProperties;
    /**
     * 通过@ConfigurationProperties注入参数创建数据源Druid
     * @return dataSource
     */
    @Bean
    public DataSource dataSource2() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername(jdbcProperties.getUrl());
        dataSource.setPassword(jdbcProperties.getPassword());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());

        return dataSource;
    }


    /**
     * 自动读取application.properties装配到对应名字的属性里
     */
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource3() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

    /**
     * 自动读取application.properties装配到对应名字的属性里,
     * 读取springboot默认的数据源，未验证
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource4() {
        this.dataSource().getConnection();
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
