package com.mycompany.eva2_4_bisiesto;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_4_BISIESTO {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int YEAR;
        int LEAPYEAR;
        System.out.println("WHAT YEAR IS IT?");
        YEAR = CPTR.nextInt();
        LEAPYEAR = (YEAR % 4);
        if (LEAPYEAR == 0){ // --> Year is divisible by 4
            LEAPYEAR = (YEAR % 100);
            if (LEAPYEAR == 0) { // --> Year is divisible by 100
                LEAPYEAR = (YEAR % 400);
                if (LEAPYEAR == 0){ // --> Year is divisible by 400
                    System.out.println("IT'S LEAP YEAR");
                } else // --> YEAR IS NOT DIVISIBLE BY 400
                {System.out.println("NOT LEAP YEAR");}
            } else // --> YEAR IS NOT DIVIBLE BY 100, WHICH MEANS IT'S A LEAP YEAR
            {System.out.println("IT'S LEAP YEAR");}
        } else // --> YEAR IS NOT DIVISIBLE BY 4
        {System.out.println("NOT LEAP YEAR");}
    }
}
