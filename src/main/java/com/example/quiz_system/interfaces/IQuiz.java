package com.example.quiz_system.interfaces;

import java.util.List;

public interface IQuiz<Q extends IQuestion<? extends IAnswer>> {
    String getTitle();
    List<Q> getQuestions();
    void addQuestion(Q question);
    void startQuiz();
}
