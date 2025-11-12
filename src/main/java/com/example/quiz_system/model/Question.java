package com.example.quiz_system.model;

import java.util.List;

public class Question implements com.example.quiz_system.interfaces.IQuestion {
    private String text;
    private List<com.example.quiz_system.interfaces.IAnswer> answers;

    public Question(String text, List<com.example.quiz_system.interfaces.IAnswer> answers) {
        this.text = text;
        this.answers = answers;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public List<com.example.quiz_system.interfaces.IAnswer> getAnswers() {
        return answers;
    }

    @Override
    public boolean checkAnswer(com.example.quiz_system.interfaces.IAnswer answer) {
        return answer.isCorrect();
    }

    @Override
    public String toString() {
        return "Question: " + text + "\nAnswers: " + answers;
    }
}
