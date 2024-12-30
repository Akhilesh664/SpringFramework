package com.example.REgex.AdvJavaBatchC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.REgex.AdvJavaBatchC.Games.GameMenu;
import com.example.REgex.AdvJavaBatchC.Games.GameRunner;
import com.example.REgex.AdvJavaBatchC.Games.MarioGame;
import com.example.REgex.AdvJavaBatchC.Games.PacmanGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GameMenu game() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GameMenu game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}
 