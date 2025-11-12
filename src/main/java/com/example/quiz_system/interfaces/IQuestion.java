package com.example.quiz_system.interfaces;

import java.util.List;

public interface IQuestion {
    String getText();
    List<IAnswer> getAnswers();
    boolean checkAnswer(IAnswer answer);
}
