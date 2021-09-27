package com.hinterwelt;

import java.util.List;
/*+----------------------------------------------------------------------
 ||
 ||  Class Count
 ||
 ||         Author:  Bill Corrie
 ||
 ||        Purpose:  Calculates the number of elements in the list.
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Methods:  String calculateMethod(List<Interger>) - Returns the
 ||                     elements in the list as a String for output.
 ||
 ++-----------------------------------------------------------------------*/
public class Count implements iCalcMethods{
    @Override
    public String calculateMethod(List <Integer> numberList) {
        // Are there elements in the list
        if(!numberList.isEmpty()) {
            return String.valueOf(numberList.size());
        }

        // Guess Not, return 0 for an empty list
        return "0";
    }
}