package Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Resource rc=new ClassPathResource("SpringConfig.xml");
//		BeanFactory bn=new XmlBeanFactory(rc);
		ApplicationContext bn=new ClassPathXmlApplicationContext("SpringConfig.xml");
		College s=(College)bn.getBean("obj1");
//		System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		System.out.println(s);
	}
}
