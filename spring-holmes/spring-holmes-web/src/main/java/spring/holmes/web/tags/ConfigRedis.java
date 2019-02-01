package spring.holmes.web.tags;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: shuli.lu
 * @Descriptin:
 * @Date: Create in 下午05:59 2019/1/31
 */
@Configuration
public class ConfigRedis {
    @Bean
    public MyRedisTemplate myRedisTemplate(){
        return new MyRedisTemplate();
    }
}
