import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.baidu.langshiquan.ioc.User;

/**
 * Created by langshiquan on 17/9/27.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class LoadTest {

    @Test
    public void loadBeanFactoryFromClassPathXml() {
        Resource resource = new ClassPathResource("spring-ioc.xml");
        XmlBeanFactory beanFactory = new XmlBeanFactory(resource);
        User user = (User) beanFactory.getBean("oneUser");
        System.out.println(user.getId());
    }

    @Test
    public void loadContextFromClassPathXml() {
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("file:/Users/langshiquan/workspace/baidu/springDesign/src/main/resources/spring-ioc.xml");
        User user = (User) context.getBean("oneUser");
        System.out.println(user.getId());
    }

    @Test
    public void loadContextFromFilePath() {
        // 相对classpath路径
        // ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring-ioc.xml");
        // 绝对路径
        // ApplicationContext context = new FileSystemXmlApplicationContext
        // ("file:/Users/langshiquan/workspace/baidu/springDesign/src/main/resources/spring-ioc.xml");
        // 绝对路径
        ApplicationContext context =
                new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
        User user = (User) context.getBean("oneUser");
        System.out.println(user.getId());
    }

}
