package springioc_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings({ "unused", "deprecation" })
public class Main {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("myspring.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		IAnimal animal=beanFactory.getBean("cow",CowImpl.class);
		animal.sound();
	}
}