package com.demo.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(AnnotationConfig.class)) 
		{
			AService aService = context.getBean(AService.class);
			System.out.println(aService);
			System.out.println("Singleton (default scope) bean initialized only once");
			for (int i = 0; i < 2; i++) {
				System.out.println(context.getBean(SingletonScopeBean.class));
			}
			System.out.println("Prototype bean initialized every time get bean is called");
			for (int i = 0; i < 2; i++) {
				System.out.println(context.getBean(PrototypeBean.class));
			}
		}
}
}
