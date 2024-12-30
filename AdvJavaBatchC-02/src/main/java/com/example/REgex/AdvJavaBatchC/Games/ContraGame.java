package com.example.REgex.AdvJavaBatchC.Games;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class ContraGame implements GameMenu{
	
	public void up() {
		System.out.println("move forward");
	}
	
	public void down() {
		System.out.println("move backward");
	}
	
	public void left() {
		System.out.println("left dive");
	}
	
	public void right() {
		System.out.println("right dive");
	}

}
