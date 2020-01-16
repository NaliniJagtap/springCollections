package springCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	 public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	      springCollectionExample SC=(springCollectionExample)context.getBean("springcollectionexample");

	      SC.getSpringList();
	      SC.getSpringSet();
	      SC.getSpringMap();
	      SC.getSpringProp();
	   }

}
