package spring.holmes.web.profile;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.holmes.web.property.AppConfig2;
import spring.holmes.web.property.MyDatasource;

/**
 * @Author: shuli.lu
 * @Descriptin:
 * @Date: Create in 下午02:47 2019/2/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig2.class)
@ActiveProfiles("pro")
public class AppConfigTest {
    @Autowired
    private MyDatasource datasource;
    @Test
    public void test() {
        System.out.println(datasource);
    }
}
