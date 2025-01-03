package com.example.REgex.AdvJavaBatchC.Optional;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
//class YourBusinessClass{ 
//	
//	private SomeClass someclass;
//
//	public YourBusinessClass(SomeClass someclass) {
//		super();
//		this.someclass = someclass;
//		System.out.println("your business class is created..!!");
//	}
//
//	@PostConstruct
//	public void init() {
//		someclass.initialization();
//	}
//	
//	@PreDestroy
//	public void destroy() {
//		System.out.println("everything is destroyed before the end..");
//	}
//
//}
//
//
//@Component
//class SomeClass{
//	public void initialization() {
//		System.out.println("Initialization logic is here..!!");
//	}
//}
//
//@Component
//class A{
//	A(){
//		System.out.println("Eager constructor is called");
//	}
//}
//
//@Component
//@Lazy
//class B{
//	B(){
//		System.out.println("Lazy constructor is called");
//	}
//}

// @named(jakarta-EE) is similar to @component annotation (java EE - spring) 
@Named
class YourBusinessLogic {
	
	@Autowired
	Dependency_1 depu1;
	
	@Inject
	Dependency_2 depu2;

	
	@Override
	public String toString() {
		return "YourBusinessLogic [depu1=" + depu1 + ", depu2=" + depu2 + "]";
	}

}


@Component
class Dependency_1{
	
}

@Component
class Dependency_2{
	
}


@Configuration
@ComponentScan
public class App04SpringPostPreConstructorDestroy {
	
	public static void main(String[] args) {
		
		// Spring context 
		System.out.println("Context is not started yet...");
		var context = new AnnotationConfigApplicationContext(App04SpringPostPreConstructorDestroy.class);
		 
		System.out.println("====================================================");
		System.out.println(context.getBeanDefinitionCount());
		
		System.out.println("====================================================");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println("====================================================");
//		System.out.println(context.getBean(YourBusinessClass.class));
//		System.out.println(context.getBean(B.class));
//		context.close();
		
		System.out.println(context.getBean(YourBusinessLogic.class));

	}

}
  