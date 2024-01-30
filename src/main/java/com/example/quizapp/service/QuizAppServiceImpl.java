package com.example.quizapp.service;

import com.example.quizapp.entity.Results;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuizAppServiceImpl implements QuizAppService{


    @Override
    public Map<String,List<Results>> getQuizData() {
        List<Results> resultList = new ArrayList<>();
        Map<String, List<Results>> responseData = new HashMap<>();
        Results results = new Results();
        results.setCategory("Computer Science");
        results.setDifficulty("Medium");
        results.setType("multiple");
        results.setQuestion("Full Form of HTML is?");
        results.setCorrect_answer("HyperText Markup Language");
        results.setIncorrect_answers(new String[]{"Hyper Mark Lang","HyperText Money Language","HyperTry Mark Language"});
        resultList.add(results);
        responseData.put("results",resultList);
        return responseData;
    }
}
