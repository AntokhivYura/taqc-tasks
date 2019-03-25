package com.softserve.task4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number : ");

        int firstNumber = sc.nextInt();

        System.out.println("Second number : ");

        int secondNumber = sc.nextInt();

        EuclidAlgorithm algorithm = new EuclidAlgorithm();

        int highestDiv = algorithm.getHighestDiv(firstNumber, secondNumber);

        algorithm.printAnswer(firstNumber, secondNumber, highestDiv);
    }
}
