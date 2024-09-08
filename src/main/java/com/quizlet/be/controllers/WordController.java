package com.quizlet.be.controllers;

import com.quizlet.be.services.WordService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("words")
@RequiredArgsConstructor
public class WordController {

    private final WordService wordService;


    @GetMapping("/bonjour")
    public ResponseEntity<String> retournerBonjour(){
        return new ResponseEntity<>(wordService.retournerBonjour(), HttpStatus.OK);
    }


}
