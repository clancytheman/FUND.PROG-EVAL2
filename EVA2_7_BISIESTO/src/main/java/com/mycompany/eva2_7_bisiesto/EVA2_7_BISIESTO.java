package com.mycompany.eva2_7_bisiesto;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_7_BISIESTO {

    public static void main(String[] args) {
    
        Scanner CPTR = new Scanner (System.in);
        int YEAR, LY4, LY100, LY400; //"LY" = LEAP YEAR. :)
        System.out.println("WHAT YEAR IS IT?");
        YEAR = CPTR.nextInt();
        LY4 = (YEAR % 4);
        LY100 = (YEAR % 100);
        LY400 = (YEAR % 400);
        // "&&" --> AND
        // "||" --> OR
        // "!" ---> NOT
        // "!=" --> "Diferente a:"
        if ((LY4 == 0) && ((LY100 != 0) || (LY400 == 0)))
            System.out.println("THE YEAR " + YEAR + " IS A LEAP YEAR"); 
        else
            System.out.println("THE YEAR " + YEAR + " IS NOT A LEAP YEAR");
        }
  }
