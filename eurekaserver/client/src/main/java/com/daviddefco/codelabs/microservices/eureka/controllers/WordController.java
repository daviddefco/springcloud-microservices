package com.daviddefco.codelabs.microservices.eureka.controllers;

import com.daviddefco.codelabs.microservices.eureka.domain.Word;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WordController {
    @Value("${words}")
    private String words;

    @GetMapping("/")
    public @ResponseBody
    Word getWord() {
        String[] wordArray = words.split(",");
        int i = (int)Math.round(Math.random() * (wordArray.length - 1));
        return new Word(wordArray[i]);
    }
}
