package com.example.REgex.AdvJavaBatchC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.REgex.AdvJavaBatchC.Games.GameMenu;
import com.example.REgex.AdvJavaBatchC.Games.GameRunner;


@Configuration
@ComponentScan
public class App03GameConsoleSpring {
	
	public static void main(String[] args) {
		
		// Spring context 
		var context = new AnnotationConfigApplicationContext(App03GameConsoleSpring.class);

		context.getBean(GameMenu.class).up();
		
		context.getBean(GameRunner.class).run();
		
	}

}
  