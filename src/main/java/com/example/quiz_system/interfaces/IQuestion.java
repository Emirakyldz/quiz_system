package com.example.quiz_system.interfaces;

import java.util.List;

public interface IQuestion<A extends IAnswer> {
    String getText();
    List<A> getAnswers();
    boolean checkAnswer(A answer);
}