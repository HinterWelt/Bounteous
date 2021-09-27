package com.hinterwelt;

import java.util.Formatter;
import java.util.List;

/*+----------------------------------------------------------------------
 ||
 ||  Class Mean
 ||
 ||         Author:  Bill Corrie
 ||
 ||        Purpose:  Calculates the Mean of a set of Integers passed into the
 ||                   calculateMethod.
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Methods:  String calculateMethod(List<Interger>) - Returns the
 ||                     Mean of the set of Integers as a String for output.
 ||
 ++-----------------------------------------------------------------------*/
public class Mean implements iCalcMethods {
    @Override
    public String calculateMethod(List <Integer> numberList) {
        // Var to hold the sum of all Integers in the list
        Integer sum = 0;
        // String formatter for the output
        Formatter formatter = new Formatter();

        // Does the list contain elements?
        if(!numberList.isEmpty()) {
            for (Integer mark : numberList) {
                sum += mark;
            }
            // Return the formatted string with 2 degrees of precision
            return formatter.format("%.2f", (sum.doubleValue() / numberList.size())).toString();
        }

        // List is empty, return NA
        return "NA";
    }
}