package spring.holmes.web.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: shuli.lu
 * @Descriptin:
 * @Date: Create in 下午02:43 2019/2/1
 */
//针对开发环境的配置
@Configuration
@Profile("dev")
@PropertySource("classpath:db-dev.properties")
public class ConfigDev {

    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;
    @Value("${db.url}")
    private String url;
    @Value("${db.driverClass}")
    private String driverClass;

    @Bean
    public MyDatasource datasource() {
        return new MyDatasource(username, password, url, driverClass);
    }
}