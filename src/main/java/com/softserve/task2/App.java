package com.softserve.task2;

import com.softserve.io.read.ReadFromConsole;

public class App {
    public static void main(String[] args) {
        ReadFromConsole readFromConsole = new ReadFromConsole();
        int valueFromConsole = readFromConsole.getValueFromConsole();

        System.out.println(valueFromConsole);

        ReverseNumber rn = new ReverseNumber(valueFromConsole);

        int reversedNumber = rn.reverseNumber();

        rn.printAnswer(reversedNumber);

    }
}
