package com.example.quizapp.service;

import com.example.quizapp.entity.Results;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface QuizAppService {

    public Map<String,List<Results>> getQuizData();
}
