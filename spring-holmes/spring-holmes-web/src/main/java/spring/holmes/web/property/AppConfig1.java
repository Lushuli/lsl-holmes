package spring.holmes.web.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @Author: shuli.lu
 * @Descriptin:
 * @PropertySource代表引入外部的.properties资源文件
 * @PropertySources嵌套@PropertySource引入多个外部资源文件
 * @Date: Create in 下午02:49 2019/2/1
 */
@Configuration
@PropertySource("classpath:db.properties")
public class AppConfig1 {

    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;
    @Value("${db.url}")
    private String url;
    @Value("${db.driverClass}")
    private String driverClass;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer (){
        return new PropertySourcesPlaceholderConfigurer();
    }
    @Bean
    public MyDatasource datasource(){
        return new MyDatasource(username, password, url, driverClass);

    }
}