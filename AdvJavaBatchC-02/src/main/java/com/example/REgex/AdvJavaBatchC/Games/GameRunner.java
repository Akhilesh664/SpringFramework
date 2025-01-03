package com.example.REgex.AdvJavaBatchC.Games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	private GameMenu game;
	

	public GameRunner(@Qualifier("hello")GameMenu game) { // Initialize MarioGame Instance
		this.game = game;
	}
	

	
	public void run() {
		System.out.println("game is running.........."+game);
		
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
	// Simulate game play by calling MarioGame methods


}
