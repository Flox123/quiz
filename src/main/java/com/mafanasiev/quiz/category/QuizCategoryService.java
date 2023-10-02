package com.mafanasiev.quiz.category;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class QuizCategoryService {
    private QuizCategoryRepository quizCategoryRepository;
}
