package spring.holmes.web.tags;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: shuli.lu
 * @Descriptin:
 * @Date: Create in 下午06:24 2019/1/31
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class ImportTagTest {
    @Autowired
    private MyDataSource datasource;
    @Autowired
    private MyRedisTemplate redisTemplate;
    @Test
    public void test(){
        System.out.println(datasource);
        System.out.println(redisTemplate);
    }
}
