import org.junit.Test;

import com.baidu.langshiquan.ioc.UnitTestBase;
import com.baidu.langshiquan.ioc.User;

/**
 * Created by langshiquan on 17/9/27.
 */
public class DITest extends UnitTestBase {

    @Test
    public void getPropertyBean() {
        User user = super.getBean("oneUser");
        System.out.println(user.getId());
    }
    // constructor
    @Test
    public void getConstructorBean() {
        User user = super.getBean("secondUser");
        System.out.println(user.getId());
    }

}