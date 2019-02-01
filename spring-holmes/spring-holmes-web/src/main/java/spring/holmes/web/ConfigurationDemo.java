package spring.holmes.web;

/**
 * @Author: shuli.lu
 * @Descriptin:
 * @Date: Create in 上午11:51 2019/1/31
 */

public class ConfigurationDemo {
    private ConfigurationDemo2 otherBean;
    public ConfigurationDemo() {
        System.out.println("ConfigurationDemo");
    }

    @Override
    public String toString() {
        return "ConfigurationDemo{88888}";
    }

    public void setOtherBean(ConfigurationDemo2 otherBean) {
        this.otherBean = otherBean;
    }

    public ConfigurationDemo2 getOtherBean() {
        return otherBean;
    }
}
