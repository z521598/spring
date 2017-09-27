import org.junit.Test;

import com.baidu.langshiquan.ioc.UnitTestBase;
import com.baidu.langshiquan.ioc.User;

/**
 * Created by langshiquan on 17/9/27.
 */
public class configTest extends UnitTestBase {

    @Test
    public void testConfig() {
        User user = super.getBean("oneXUser");
        System.out.println(user);
        User user2 = super.getBean("twoXUser");
        System.out.println(user2);

    }
}
