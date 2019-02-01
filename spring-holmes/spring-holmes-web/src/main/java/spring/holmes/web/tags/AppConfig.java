package spring.holmes.web.tags;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: shuli.lu
 * @Descriptin: import标签
 * @Date: Create in 下午06:07 2019/1/31
 */
@Configuration
@Import({ConfigDataSource.class,ConfigRedis.class})
public class AppConfig {
}
