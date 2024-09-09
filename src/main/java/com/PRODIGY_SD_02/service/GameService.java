package com.PRODIGY_SD_02.service;

import com.PRODIGY_SD_02.model.Game;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameService {
    private final Random random = new Random();

    public Game startNewGame() {
        Game game = new Game();
        game.setTargetNumber(random.nextInt(1000) + 1); // Random number between 1 and 1000
        game.setAttempts(0);
        game.setMessage("Guess the number!");
        return game;
    }

    public Game makeGuess(Game game, int guess) {
        game.setAttempts(game.getAttempts() + 1);
        if (guess < game.getTargetNumber()) {
            game.setMessage("Too low! Try again.");
        } else if (guess > game.getTargetNumber()) {
            game.setMessage("Too high! Try again.");
        } else {
            game.setMessage("Congratulations! You've guessed the number in " + game.getAttempts() + " attempts.");
        }
        return game;
    }
}
