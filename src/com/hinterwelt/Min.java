package com.hinterwelt;

import java.util.Collections;
import java.util.List;
/*+----------------------------------------------------------------------
 ||
 ||  Class Min
 ||
 ||         Author:  Bill Corrie
 ||
 ||        Purpose:  Calculate the minimum valued element in the list.
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Methods:  String calculateMethod(List<Interger>) - Returns the
 ||                     Min of the set of Integers as a String for output.
 ||
 ++-----------------------------------------------------------------------*/
public class Min implements iCalcMethods{
    @Override
    public String calculateMethod(List <Integer> numberList) {
        // Does the list have elements?
        if(!numberList.isEmpty()) {
            return Collections.min(numberList).toString();
        }

        // The list did not have any elements
        return "NA";
    }
}