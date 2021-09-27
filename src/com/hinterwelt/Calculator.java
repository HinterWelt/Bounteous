package com.hinterwelt;

import java.util.ArrayList;
import java.util.List;

/*+----------------------------------------------------------------------
 ||
 ||  Class Calculator
 ||
 ||         Author:  Bill Corrie
 ||
 ||        Purpose:  This is the main facade class that uses composition
 ||                   to instantiate and run the classes with their
 ||                   calculateMethods. It handles printing out the statistics
 ||                   to the console.
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Variables:  numberList List<Interger> - Cleaned list of integers the
 ||                     user input.
 ||
 ++-----------------------------------------------------------------------*/
public class Calculator {

    // Class variable for the list of numbers to work on
    private List <Integer> numberList = new ArrayList <Integer>();

    // Constructor for the class where we set the numberList
    public Calculator(List <Integer> newNumberList) {
        numberList = newNumberList;

    }

    // Method to perform the calculations. We could decrease the number of invokations with
    // a factory here but seems like overkill.
    public void calculate() {
        Mean meanAverage = new Mean();
        Max maxElement = new Max();
        Min minElement = new Min();
        Median meadianCalc = new Median();
        Count countCalc = new Count();

        System.out.println("Count: " + countCalc.calculateMethod(numberList));
        System.out.println("Minimum: " + minElement.calculateMethod(numberList));
        System.out.println("Maximum: " +maxElement.calculateMethod(numberList));
        System.out.println("Mean: " + meanAverage.calculateMethod(numberList));
        System.out.println("Median: " + meadianCalc.calculateMethod(numberList));

    }
}
