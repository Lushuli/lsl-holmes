package spring.holmes.web.property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: shuli.lu
 * @Descriptin:
 * @Date: Create in 下午02:52 2019/2/1
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig1.class)
public class AppConfig1Test {

    @Autowired
    private MyDatasource datasource;

    @Test
    public void test() {
        System.out.println(datasource);
    }
}
