package com.sinopac.springbootweb.config.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 功能描述:jdbc配置属性pojo类<br>
 *
 * @author hp
 * @date 2020-09-05 16:46
 */
// JdbcConfig.dataSource2()
@ConfigurationProperties(prefix = "jdbc")// springboot的注解,仅能读取springboot的Application配置文件,set注入值
public class JdbcProperties {
    private String username;
    private String password;
    private String url;
    private String driverClassName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
}
