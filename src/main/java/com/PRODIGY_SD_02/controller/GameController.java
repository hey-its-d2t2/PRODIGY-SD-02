package com.PRODIGY_SD_02.controller;

import com.PRODIGY_SD_02.model.Game;
import com.PRODIGY_SD_02.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/my-game")
@SessionAttributes("game")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/")
    public String showGameForm(Model model) {
        if (!model.containsAttribute("game")) {
            model.addAttribute("game", gameService.startNewGame());
        }
        return "index";
    }

    @PostMapping("/guess")
    public String makeGuess(@RequestParam("guess") String guess, Model model) {
        try {
            int guessNumber = Integer.parseInt(guess);
            Game game = (Game) model.getAttribute("game");
            if (game != null) {
                gameService.makeGuess(game, guessNumber);
            } else {
                model.addAttribute("error", "Game not found. Please start a new game.");
            }
        } catch (NumberFormatException e) {
            model.addAttribute("error", "Invalid input. Please enter a number.");
        }
        return "index";
    }

    @PostMapping("/newgame")
    public String startNewGame(SessionStatus sessionStatus, Model model) {
        sessionStatus.setComplete();
        model.addAttribute("game", gameService.startNewGame());
        return "index";
    }
}
