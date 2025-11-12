package com.example.quiz_system.interfaces;

import java.util.List;

public interface IQuiz {
    String getTitle();
    List<com.example.quiz_system.interfaces.IQuestion> getQuestions();
    void addQuestion(com.example.quiz_system.interfaces.IQuestion question);
    void startQuiz();
}
