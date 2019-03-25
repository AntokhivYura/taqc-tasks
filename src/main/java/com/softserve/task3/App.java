package com.softserve.task3;

import java.util.List;

public class App {
    public static void main(String[] args) {
        CountOfDiv countOfDiv = new CountOfDiv();

        List<Integer> listOfNumWithMaxDivider = countOfDiv.getNumWithMaxDivider();
        countOfDiv.printNumbers(listOfNumWithMaxDivider);
    }
}
