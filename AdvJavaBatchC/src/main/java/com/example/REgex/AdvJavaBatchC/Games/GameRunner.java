package com.example.REgex.AdvJavaBatchC.Games;

public class GameRunner {
	
	private GameMenu game;
	

	public GameRunner(GameMenu game) { // Initialize MarioGame Instance
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
