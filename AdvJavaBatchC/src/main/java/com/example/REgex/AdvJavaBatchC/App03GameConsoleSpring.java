package com.example.REgex.AdvJavaBatchC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.REgex.AdvJavaBatchC.Games.GameMenu;
import com.example.REgex.AdvJavaBatchC.Games.GameRunner;

public class App03GameConsoleSpring {
	
	public static void main(String[] args) {
		
		// Spring context 
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

		context.getBean(GameMenu.class).up();
		
		context.getBean(GameRunner.class).run();
		
	}

}
  