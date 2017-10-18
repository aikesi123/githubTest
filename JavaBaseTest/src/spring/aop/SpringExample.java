package spring.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringExample {

	@Test
	public void testSpringAop(){
		
		String configLocation = "classpath:spring.xml";
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
		
	 	UserDao userDao = (UserDao) applicationContext.getBean(UserDaoImpl.class);
		
	 	userDao.addUser();
	 	
	}
}
