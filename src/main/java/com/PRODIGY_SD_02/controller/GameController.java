package com.PRODIGY_SD_02.controller;

import com.PRODIGY_SD_02.model.Game;
import com.PRODIGY_SD_02.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


@Controller
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
    public String makeGuess(@RequestParam("guess") int guess, Model model) {
        Game game = (Game) model.getAttribute("game");
        gameService.makeGuess(game, guess);
        return "index";
    }

    @PostMapping("/newgame")
    public String startNewGame(SessionStatus sessionStatus, Model model) {
        sessionStatus.setComplete();
        model.addAttribute("game", gameService.startNewGame());
        return "index";
    }
}
