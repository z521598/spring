import org.junit.Test;

import com.baidu.langshiquan.ioc.UnitTestBase;
import com.baidu.langshiquan.ioc.User;
import com.baidu.langshiquan.ioc.autowire.UserService;

/**
 * Created by langshiquan on 17/9/27.
 */
public class AutowiredTest extends UnitTestBase {

    public AutowiredTest() {
        super("classpath:spring-autowired.xml");
    }

    @Test
    public void testByNameAndType() {
        UserService userService = super.getBean("userService");
        userService.save(new User());
    }

}