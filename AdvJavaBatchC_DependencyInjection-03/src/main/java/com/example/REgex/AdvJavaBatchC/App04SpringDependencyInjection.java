package com.example.REgex.AdvJavaBatchC;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

@Component
class YourBusinessClass{
	
	private Dependency1 deppu1;
	
	private Dependency2 deppu2;

	
	
	// No need to add Autowired in constructor
	public YourBusinessClass(Dependency1 deppu1, Dependency2 deppu2) {
		super();
		System.out.println("constructor dependency initialized of deepu 1");
		this.deppu1 = deppu1;
		System.out.println("constructor dependency initialized of deepu 2");
		this.deppu2 = deppu2;
	}




//	@Autowired
//	public void setDeppu1(Dependency1 deppu1) {
//		System.out.println("setter based dependency 1 logic initialized");
//		this.deppu1 = deppu1;
//	}
//
//	@Autowired
//	public void setDeppu2(Dependency2 deppu2) {
//		System.out.println("setter based dependency 2 logic initialized");
//		this.deppu2 = deppu2;
//	}

	@Override
	public String toString() {
		return "YourBusinessClass [deppu1=" + deppu1 + ", deppu2=" + deppu2 + "]";
	}
	
}

// here we are using component as bean in your_business_class
@Component(value="dep")
class Dependency1{
	public String toString() {
		return "deppu10";
	}
}

@Component
class Dependency2{
	public String toString() {
		return "deppu20";
	}
}

@Configuration
@ComponentScan
public class App04SpringDependencyInjection {
	
	public static void main(String[] args) {
		
		// Spring context 
		var context = new AnnotationConfigApplicationContext(App04SpringDependencyInjection.class);
		
		System.out.println("====================================================");
		System.out.println(context.getBeanDefinitionCount());
		
		System.out.println("====================================================");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println("====================================================");
		System.out.println(context.getBean(YourBusinessClass.class));
	
		
	}

}
  