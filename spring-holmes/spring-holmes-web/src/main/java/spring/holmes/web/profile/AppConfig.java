package spring.holmes.web.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @Author: shuli.lu
 * @Descriptin:
 * @Date: Create in 下午02:45 2019/2/1
 */
@Configuration
@Import({ ConfigDev.class, ConfigPro.class })
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}