package spring.holmes.web.mix;

/**
 * @Author: shuli.lu
 * @Descriptin: @importresource标签 在javaconfig中混用xml
 * @Date: Create in 下午08:42 2019/1/31
 */
public class ImportResourceDemo {
    private OtherBean otherBean;

    public OtherBean getOtherBean() {
        return otherBean;
    }

    public void setOtherBean(OtherBean otherBean) {
        this.otherBean = otherBean;
    }

    public void init() {
        System.out.println("===init====");
    }

    public void destory() {
        System.out.println("====destory=====");
    }
}
