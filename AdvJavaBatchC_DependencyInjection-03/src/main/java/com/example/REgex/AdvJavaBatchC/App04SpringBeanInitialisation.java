package com.example.REgex.AdvJavaBatchC;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
class NormalClass{
	
}

@Component 
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class SpecialClass{
	
}

@Configuration
@ComponentScan
public class App04SpringBeanInitialisation {
	
	public static void main(String[] args) {
		
		// Spring context 
		var context = new AnnotationConfigApplicationContext(App04SpringBeanInitialisation.class);
		
		System.out.println("====================================================");
		System.out.println(context.getBeanDefinitionCount());
		
		System.out.println("====================================================");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println("====================================================");
		System.out.println(context.getBean(NormalClass.class));
		System.out.println(context.getBean(NormalClass.class));
		System.out.println(context.getBean(NormalClass.class));
		System.out.println(context.getBean(NormalClass.class));
		
		System.out.println("====================================================");
		System.out.println(context.getBean(SpecialClass.class));
		System.out.println(context.getBean(SpecialClass.class));
		System.out.println(context.getBean(SpecialClass.class));
		System.out.println(context.getBean(SpecialClass.class));
	}

}
  