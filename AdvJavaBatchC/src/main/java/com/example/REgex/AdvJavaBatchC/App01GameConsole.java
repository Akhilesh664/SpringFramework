package com.example.REgex.AdvJavaBatchC;

import com.example.REgex.AdvJavaBatchC.Games.GameRunner;
import com.example.REgex.AdvJavaBatchC.Games.MarioGame;
import com.example.REgex.AdvJavaBatchC.Games.ContraGame;
import com.example.REgex.AdvJavaBatchC.Games.PacmanGame;

public class App01GameConsole {
	
	public static void main(String[] args) {
		
		// Loose coupling
//		var game = new MarioGame();
//		var game = new ContraGame();
		var game = new PacmanGame();
		
		var gameRunner = new GameRunner(game); // Pass MarioGame in GameRunner 
		gameRunner.run(); //use gameRunner to run the game; 
		
		
	}

}
  