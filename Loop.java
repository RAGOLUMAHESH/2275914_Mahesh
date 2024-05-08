package com.assignment.mahesh;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();

        
        System.out.println("Numbers from " + start + " to " + end + ":");
        while (start <= end) {
            System.out.print(start + " ");
            start++;
        }
    }
}

