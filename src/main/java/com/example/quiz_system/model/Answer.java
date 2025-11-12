package com.example.quiz_system.model;

import com.example.quiz_system.interfaces.IAnswer;

public class Answer implements IAnswer {
    private String text;
    private boolean isCorrect;

    public Answer(String text, boolean isCorrect) {
        this.text = text;
        this.isCorrect = isCorrect;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public boolean isCorrect() {
        return isCorrect;
    }

    @Override
    public String toString() {
        return text + (isCorrect ? " (Correct)" : "");
    }
}
