package com.example.quiz_system.model;

import com.example.quiz_system.interfaces.IAnswer;
import com.example.quiz_system.interfaces.IQuestion;

import java.util.List;

public class Question<A extends IAnswer> implements IQuestion<A> {
    private final String text;
    private final List<A> answers;

    public Question(String text, List<A> answers) {
        this.text = text;
        this.answers = answers;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public List<A> getAnswers() {
        return answers;
    }

    @Override
    public boolean checkAnswer(A answer) {
        if (answer == null) {
            return false;
        }
        return answer.isCorrect();
    }

    @Override
    public String toString() {
        return "Question: " + text + "\nAnswers: " + answers;
    }
}
