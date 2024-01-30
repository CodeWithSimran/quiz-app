package com.example.quizapp.controller;

import com.example.quizapp.entity.Results;
import com.example.quizapp.service.QuizAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class QuizAppController {

    @Autowired
    QuizAppService quizAppService;
    @CrossOrigin(origins = "http://localhost:3000")//For Testing Purpose
    @GetMapping("/getQuizData")
    public Map<String, List<Results>> getQuizAppData(){
        return quizAppService.getQuizData();
    }
}
