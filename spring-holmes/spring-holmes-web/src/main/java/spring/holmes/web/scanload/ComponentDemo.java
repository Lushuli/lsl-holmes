package spring.holmes.web.scanload;

import org.springframework.stereotype.Component;

/**
 * @Author: shuli.lu
 * @Descriptin:
 * @Date: Create in 下午04:33 2019/1/31
 */
@Component
public class ComponentDemo {
    public ComponentDemo() {
        System.out.println("ComponentDemo");
    }

    @Override
    public String toString() {
        return "ComponentDemo{88888}";
    }
}
