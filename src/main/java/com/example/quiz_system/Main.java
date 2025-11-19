package com.example.quiz_system;

import com.example.quiz_system.model.*;
import com.example.quiz_system.interfaces.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Quiz<Question<Answer>> quiz = new Quiz<>("General Knowledge Quiz");

        List<Answer> answers1 = new ArrayList<>();
        answers1.add(new Answer("Paris", true));
        answers1.add(new Answer("London", false));
        answers1.add(new Answer("Berlin", false));
        Question<Answer> question1 = new Question<>("What is the capital of France?", answers1);


        List<Answer> answers2 = new ArrayList<>();
        answers2.add(new Answer("4", true));
        answers2.add(new Answer("5", false));
        answers2.add(new Answer("6", false));
        Question<Answer> question2 = new Question<>("How many legs does a dog have?", answers2);


        quiz.addQuestion(question1);
        quiz.addQuestion(question2);

        quiz.startQuiz();

        // getting answers from user
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;

        for (IQuestion<Answer> q : quiz.getQuestions()) {
            System.out.println("\n" + q.getText());

            List<Answer> ans = q.getAnswers();
            for (int i = 0; i < ans.size(); i++) {
                System.out.println((i + 1) + ") " + ans.get(i).getText());
            }
            int choice = -1;
            while (true) {
                System.out.print("Your answer (1-" + ans.size() + "): ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= ans.size()) break;
                } else {
                    scanner.next();
                }
                System.out.println("Invalid input. Please try again.");
            }

            Answer selected = ans.get(choice - 1);
            if (q.checkAnswer(selected)) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("Wrong!");
            }
        }

        double percent = quiz.getQuestions().isEmpty() ? 0.0 : (correctCount * 100.0) / quiz.getQuestions().size();
        System.out.printf("\nQuiz finished! You got %d out of %d correct (%.2f%%).%n", correctCount, quiz.getQuestions().size(), percent);

        scanner.close();
    }
}
