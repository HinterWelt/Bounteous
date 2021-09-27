package com.hinterwelt;

import java.util.Collections;
import java.util.List;

/*+----------------------------------------------------------------------
 ||
 ||  Class Max
 ||
 ||         Author:  Bill Corrie
 ||
 ||        Purpose:  Calculates the Max value of a set of Integers passed into the
 ||                   calculateMethod.
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Methods:  String calculateMethod(List<Interger>) - Returns the
 ||                     Max value of the set of Integers as a String for output.
 ||
 ++-----------------------------------------------------------------------*/
public class Max implements iCalcMethods {

    @Override
    public String calculateMethod(List <Integer> numberList) {

        // Does the list of elements?
        if(!numberList.isEmpty()) {
            return Collections.max(numberList).toString();
        }

        // List is empty, return NA.
        return "NA";
    }

}
