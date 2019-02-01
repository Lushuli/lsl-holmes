package spring.holmes.web.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @Author: shuli.lu
 * @Descriptin:
 * @Date: Create in 下午03:04 2019/2/1
 */
@Configuration
// @PropertySource代表引入外部的.properties资源文件
//@PropertySources嵌套@PropertySource引入多个外部资源文件

@PropertySource("classpath:db.properties")
public class AppConfig2 {
    //Environment代表spring的环境，在环境里面只有两种东西： 1，读入的外部资源文件(properties)； 2，profile

    @Autowired
    private Environment env;

    @Bean
    public MyDatasource datasource() {
        return new MyDatasource(env.getProperty("db.username"), env.getProperty("db.password"),
                env.getProperty("db.url"), env.getProperty("db.driverClass"));
    }
}