package com.example.REgex.AdvJavaBatchC.HelloWorldSpring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02SpringHelloWorld {

	public static void main(String[] args) {
		
		 // launching spring context
		 var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		 System.out.println("========================================");
		 
		 // To print all beanNames used in project
//		 for(String name : context.getBeanDefinitionNames()) {
//			 System.out.println(name);
//		 }
		  // or
		 Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		 
		 // To print count of bean in project
		 System.out.println("bean count : "+context.getBeanDefinitionCount());
		 
		 System.out.println("========================================");
		 
		 
		 // configure the thing that we want to manage = config class
		 System.out.println(context.getBean("Name1"));

		 System.out.println(context.getBean("Age"));

		 System.out.println(context.getBean("person"));
		
		 System.out.println(context.getBean("address2"));

		 System.out.println(context.getBean("person2MethodCall"));
		
		 System.out.println(context.getBean(Address.class));
		
		 System.out.println(context.getBean("person2ParameterCall"));


		
	}

}
