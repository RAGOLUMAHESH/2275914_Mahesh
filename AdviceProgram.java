package com.assignment.mahesh;

import java.util.Random;
import java.util.Scanner;

public class AdviceProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] adviceList = {
            "Follow your heart.",
            "Stay focused on your goals.",
            "Take a leap of faith.",
            "Trust your instincts."
        };

        String question;
        String response;

        do {
            System.out.print("Ask me a question (or type 'quit' to exit): ");
            question = scanner.nextLine();

            if (!question.equalsIgnoreCase("quit")) {
                int randomIndex = random.nextInt(adviceList.length);
                response = adviceList[randomIndex];
                System.out.println("Advice: " + response);
            }
        } while (!question.equalsIgnoreCase("quit"));
    }
}
