package spring.holmes.web.scanload;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: shuli.lu
 * @Descriptin:
 * @Configuration标签表示这个类可被Spring识别的配置对象的类,
 * 这有有这个标记的标签的类才能使用@Bean标签作用于对应的方法上面
 * @ComponentScan:开启组件自动扫描；
 * 默认情况下，它会扫描当前类所在的包及其子包中的所有标签对象加载到Spring容器
 * @Date: Create in 下午04:34 2019/1/31
 */
 @Configuration
 @ComponentScan(basePackages="spring.holmes.web.scanload")
public class AppConfigScan {
}
