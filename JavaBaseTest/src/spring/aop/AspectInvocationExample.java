package spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectInvocationExample {

	@Before("execution(* com.spring.aop.UserDao.(..))")
	public void before(){
		System.out.println("before");
	}
}
