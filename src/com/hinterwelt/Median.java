package com.hinterwelt;

import java.util.Collections;
import java.util.Formatter;
import java.util.List;
/*+----------------------------------------------------------------------
 ||
 ||  Class Median
 ||
 ||         Author:  Bill Corrie
 ||
 ||        Purpose:  Calculates the median of a set of Integers passed into the
 ||                   calculateMethod.
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Methods:  String calculateMethod(List<Interger>) - Returns the
 ||                     Median of the set of Integers as a String for output.
 ||
 ++-----------------------------------------------------------------------*/
public class Median implements iCalcMethods {
    @Override
    public String calculateMethod(List <Integer> numberList) {
        // Formatter for the double that comes our. Keeps output
        // to two degrees of precision.
        Formatter formatter = new Formatter();
        if(!numberList.isEmpty()) {
            // Sort the list to get ready for median calculation
            Collections.sort(numberList);
            double middle = numberList.size()/2;

            //Do we have an odd number of elements
            if (numberList.size() % 2 == 1) {
                middle = numberList.get(numberList.size()/2);
            // We have an even number of elements
            }else {
                middle =  (numberList.get(numberList.size()/2)
                        + numberList.get(numberList.size()/2-1)) / 2.0;
            }
            // Return the formatted string
            return  formatter.format("%.2f", middle).toString();
        }

        // List is empty, return na.
        return "NA";
    }
}