package spring.holmes.web.property;

import lombok.Data;

/**
 * @Author: shuli.lu
 * @Descriptin:
 * @Date: Create in 下午09:00 2019/1/31
 */
@Data
public class MyDatasource {
    public MyDatasource(String username, String password, String url, String driverClass) {
        this.username = username;
        this.password = password;
        this.url = url;
        this.driverClass = driverClass;
    }

    private String username;
    private String password;
    private String url;
    private String driverClass;
}
