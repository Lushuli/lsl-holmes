package spring.holmes.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.holmes.web.scanload.AppConfigScan;
import spring.holmes.web.scanload.ComponentDemo;

/**
 * @Author: shuli.lu
 * @Descriptin:
 * @Date: Create in 上午11:46 2019/1/31
 */

public class TestMain {
    public static void main(String[] arg) {
        /**
         * 通过配置文件加载类
         */
/*        ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
        HelloWord sb = ctx.getBean(HelloWord.class);
        System.out.println(sb);
        System.out.println(sb.toString());*/

        /**
         * 通过@Bean标签加载类
         */
/*        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigurationDemo sb = context.getBean(ConfigurationDemo.class);
        System.out.println(sb);
        System.out.println(sb.toString());*/

        /**
         * 通过@Component标签加载类
         */
   /*     ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigScan.class);
        ComponentDemo sb = ctx.getBean(ComponentDemo.class);
        System.out.println(sb);
        System.out.println(sb.toString());*/

        /**
         * 对象的关系引用
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigurationDemo sb = context.getBean(ConfigurationDemo.class);

       // System.out.println(configurationDemo.getOtherBean());
        System.out.println(sb.getOtherBean());



    }
}
