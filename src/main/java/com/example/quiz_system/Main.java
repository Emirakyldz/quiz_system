package com.example.quiz_system;

import com.example.quiz_system.model.*;
import com.example.quiz_system.interfaces.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz("General Knowledge Quiz");

        List<IAnswer> answers1 = new ArrayList<>();
        answers1.add(new Answer("Paris", true));
        answers1.add(new Answer("London", false));
        answers1.add(new Answer("Berlin", false));
        Question question1 = new Question("What is the capital of France?", answers1);


        List<IAnswer> answers2 = new ArrayList<>();
        answers2.add(new Answer("4", true));
        answers2.add(new Answer("5", false));
        answers2.add(new Answer("6", false));
        Question question2 = new Question("How many legs does a dog have?", answers2);


        quiz.addQuestion(question1);
        quiz.addQuestion(question2);

        quiz.startQuiz();

        // getting answers from user
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;

        for (IQuestion q : quiz.getQuestions()) {
            System.out.println("\n" + q.getText());

            List<IAnswer> ans = q.getAnswers();
            for (int i = 0; i < ans.size(); i++) {
                System.out.println((i + 1) + ") " + ans.get(i).getText());
            }

            System.out.print("Your answer (1-" + ans.size() + "): ");
            int choice = scanner.nextInt();

            IAnswer selected = ans.get(choice - 1);
            if (q.checkAnswer(selected)) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("Wrong!");
            }
        }

        // results
        System.out.println("\nQuiz finished!");
        System.out.println("You got " + correctCount + " out of " + quiz.getQuestions().size() + " correct.");

        scanner.close();
    }
}
