package com.hinterwelt;

import java.util.List;
/*+----------------------------------------------------------------------
 ||
 ||  Interface iCalcMethods
 ||
 ||         Author:  Bill Corrie
 ||
 ||        Purpose:  This is an interface to abstract and standize the
 ||                     calculation methods across the classes. This will
 ||                     also allow us to extend the functionality more
 ||                     easily down the road.
 ||
 |+-----------------------------------------------------------------------
 ||
 ||      Methods:  calculateMethod(List<Interger>) - Method meant to be used
 ||                     to calculate the desired statistic.
 ||
 ++-----------------------------------------------------------------------*/
public interface iCalcMethods {
    String calculateMethod(List<Integer> numberList);
}
