package com.softserve.io.read;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class to read input from console.
 * @author Yurii Antokhiv
 * @version 1.0
 */
public class ReadFromConsole {
    /**
     * Value from console.
     */
    private int valueFromConsole;

    /**
     * Method to read from console.
     * @throws InputMismatchException if user will put into console not integer
     */
    private void readNumberFromConsole() throws InputMismatchException {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input number : ");
            valueFromConsole = sc.nextInt();
        }
    }

    /**
     * Method uses method readNumberFromConsole and then returns that number.
     * @return number from console
     */
    public int getValueFromConsole() {
        readNumberFromConsole();
        return valueFromConsole;
    }
}
