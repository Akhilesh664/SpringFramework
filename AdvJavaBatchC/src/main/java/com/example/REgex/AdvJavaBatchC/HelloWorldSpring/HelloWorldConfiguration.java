package com.example.REgex.AdvJavaBatchC.HelloWorldSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/*Records : are classes that act as transparent carriers for immutable data and 
 * can be thought of as nominal tuples. Records can help you write more predictable 
 * code, reduce complexity, and improve the overall quality of your Java applications.
*/
record Person(String name, int age, Address address) {}; // record is introduced in java 14
record Address(String city, String state) {}; 


@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String Name1() {
		return "akhil";
	}
	
	@Bean
	public int Age() {
		return 23;
	}
	
	/* 
	 * here in this we are using record which save our time of making whole class instead that 
	 * we make record line at top which create class and now we are using tha class to make object
	*/
	@Bean
	public Person person() {
		var person = new Person("manish", 23, new Address("agra","up"));
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(Name1(), Age(), address());
	}
	
	@Bean
	public Person person2ParameterCall(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}

	@Bean(name="address2")
	public Address address() {
		return new Address("jaipur", "rajasthan");
	}
	
	@Primary	
	@Bean
	public Address address3() {
		return new Address("mangalore", "karnataka");
	}
	
	
	
	
}
