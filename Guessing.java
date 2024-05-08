package com.assignment.mahesh;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;
        int guess;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between " + min + " and " + max + ". Guess what it is:");

        do {
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low! Try again:");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again:");
            } else {
                System.out.println("Congratulations! You guessed it right.");
            }
        } while (guess != randomNumber);
    }
}

