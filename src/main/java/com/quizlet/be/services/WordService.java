package com.quizlet.be.services;


import com.quizlet.be.repositories.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class WordService {

    @Autowired
    private  WordRepository wordRepository;

    public String retournerBonjour(){
        return "Bonjour";
    }
}
