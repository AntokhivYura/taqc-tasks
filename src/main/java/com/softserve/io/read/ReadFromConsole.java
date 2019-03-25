package com.softserve.io.read;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsole {
    private int valueFromConsole;
    private Scanner scanner;

    private void readNumberFromConsole() {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Input number : ");
            valueFromConsole = scanner.nextInt();
        }catch (InputMismatchException ex){
            System.out.println("Invalid input !!!");
        }
    }

    public int getValueFromConsole() {
        readNumberFromConsole();
        return valueFromConsole;
    }
}
