package com.example.jokeswebapp.controller;

import com.example.jokeswebapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    //multiple request mappings (this method will be triggered with / and empty GET Requests)
    @GetMapping({"/",""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.returnJoke());
        return "index";
    }
}
