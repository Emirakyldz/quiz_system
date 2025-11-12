package com.example.quiz_system.model;

import java.util.ArrayList;
import java.util.List;

public class Quiz implements com.example.quiz_system.interfaces.IQuiz {
    private String title;
    private List<com.example.quiz_system.interfaces.IQuestion> questions;

    public Quiz(String title) {
        this.title = title;
        this.questions = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<com.example.quiz_system.interfaces.IQuestion> getQuestions() {
        return questions;
    }

    @Override
    public void addQuestion(com.example.quiz_system.interfaces.IQuestion question) {
        questions.add(question);
    }

    @Override
    public void startQuiz() {
        System.out.println("Starting quiz: " + title);
        for (com.example.quiz_system.interfaces.IQuestion q : questions) {
            System.out.println(q);
        }
    }

    @Override
    public String toString() {
        return "Quiz: " + title + "\nQuestions: " + questions;
    }
}
