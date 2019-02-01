package spring.holmes.web.mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: shuli.lu
 * @Descriptin: @importresource标签 在javaconfig中混用xml
 * @Date: Create in 下午08:50 2019/1/31
 */
@Configuration
// @importresource标签来在javaconfig中混用xml config
@ImportResource("classpath:application.xml")
public class AppConfig {
    @Bean(destroyMethod = "destory", initMethod = "init")
    public ImportResourceDemo somebean(OtherBean otherbean) {
        ImportResourceDemo sBean = new ImportResourceDemo();
        sBean.setOtherBean(otherbean);
        return sBean;
    }
}
