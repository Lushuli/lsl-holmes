package spring.holmes.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: shuli.lu
 * @Descriptin:*
 *  * @Configuration标签表示这个类可被Spring识别的配置对象的类,只有有这个标记的标签的类才能使用
 *  * @Bean标签作用于对应的方法上面
 *  * @Bean(destroyMethod = "destory", initMethod = "init")也可以通过这样的写法来配置bean的初始化方法和销毁方法
 * @Date: Create in 下午02:39 2019/1/31
 */
// 作为Spring的主配置文件
//@Configuration标签表示这个类可被Spring识别的配置对象的类,只有有这个标记的标签的类才能使用@Bean标签作用于对应的方法上面
@Configuration
public class AppConfig {
/*    //@Bean标签表示让Spring帮我们管理bean
    @Bean
    public ConfigurationDemo someBean(){
        return new ConfigurationDemo();
    }*/

/*    //第一种方式(对象的注入)
    @Bean(destroyMethod = "destory", initMethod = "init")
    public ConfigurationDemo someBean(ConfigurationDemo2 otherBean) {
        ConfigurationDemo sBean = new ConfigurationDemo();
        sBean.setOtherBean(otherBean);
        return sBean;
    }*/
//第二种方式
@Bean
public ConfigurationDemo someBean2() {
    ConfigurationDemo sBean = new ConfigurationDemo();
    sBean.setOtherBean(otherBean());
    return sBean;
}

    @Bean
    public ConfigurationDemo2 otherBean() {
        return new ConfigurationDemo2();
    }
}
