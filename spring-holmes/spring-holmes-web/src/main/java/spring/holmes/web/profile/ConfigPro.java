package spring.holmes.web.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: shuli.lu
 * @Descriptin:
 * @Date: Create in 下午09:23 2019/1/31
 */
//生产环境的配置对象
@Configuration
@Profile("pro")
@PropertySource("classpath:db-profile.properties")
public class ConfigPro {

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