package com.example.quiz_system.model;

import com.example.quiz_system.interfaces.IAnswer;
import com.example.quiz_system.interfaces.IQuestion;
import com.example.quiz_system.interfaces.IQuiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz<Q extends IQuestion<? extends IAnswer>> implements IQuiz<Q> {
    private final String title;
    private final List<Q> questions;

    public Quiz(String title) {
        this.title = title;
        this.questions = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<Q> getQuestions() {
        return questions;
    }

    @Override
    public void addQuestion(Q question) {
        questions.add(question);
    }

    @Override
    public void startQuiz() {
        System.out.println("Starting quiz: " + title);
        for (Q q : questions) {
            System.out.println(q);
        }
    }

    @Override
    public String toString() {
        return "Quiz: " + title + "\nQuestions: " + questions;
    }
}
