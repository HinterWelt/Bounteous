package com.hinterwelt;

import java.util.*;
/*+----------------------------------------------------------------------
 ||
 ||  Class Main
 ||
 ||         Author:  Bill Corrie
 ||
 ||        Purpose:  This is the main application and contains the display
 ||                   for the user interface. It uses composition to
 ||                   abstract the statistics functions behind a facade
 ||                   pattern. An interface is used to standardize these
 ||                   methods called and ensure a method to handle
 ||                   calculating the values.
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Variables:  Scanner userInput - used to pull input from STDIN.
 ||                  errorCount int - count of the number of incorrect
 ||                     values entered.
 ||                  numberList List<Interger> - Cleaned list of integers the
 ||                     user input.
 ||                  stringInput String - Single line the user inputs
 ||
 ++-----------------------------------------------------------------------*/
public class Main {

    public static void main(String[] args) {

        // Main Vars
        Scanner userInput = new Scanner(System.in);
        int errorCount = 0;
        List<Integer> numberList = new ArrayList<Integer>();
        String stringInput = new String("");

        // Instructions for the user and how to end input
        System.out.println("Enter one positive number per line, hit enter with no input to exit.");

        // While loop that runs until user enters an empty line
        while(!(stringInput = userInput.nextLine()).isEmpty())
        {
            // Guardian clause to break out of loop on empty line
            if (stringInput.isBlank()) break;

            // Flace and count vars
            boolean eFlag = false;
            int number = 0;
            // Try converting the Integer, if error, set eFlag and output error message. Allow to continue.
            try{
                number = Integer.parseInt(stringInput);
            } catch(NumberFormatException e){
                eFlag = true;
                System.out.println("Not a positive integer");

            }

            // If there was an error or the number is less than 0, increment errorCount;
            // else add the number to the list. This keeps our list valid
            if(number<0 || eFlag) {
                errorCount++;
            } else{
                numberList.add(number);
            }


        }

        // Close our scanner
        userInput.close();

        //Show the list. I know this is not in the reqs but it just makes sense
        System.out.println("Number List: " + numberList.toString());

        // Calculator handles the statisitcs calculation
        Calculator calc = new Calculator(numberList);
        calc.calculate();

        // Output the errorCount. This is handled in the main as it is a trivial task.
        System.out.println("Errors: " + errorCount);

    }


}
