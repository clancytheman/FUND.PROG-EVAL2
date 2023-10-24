package com.mycompany.eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_12_CALIFAS_EUA {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int CALIF;
        System.out.println("GRADE:");
        CALIF = CPTR.nextInt();
        //EVALUAR
        if((CALIF >= 0) && (CALIF <= 100)){
            if((CALIF >= 90) && (CALIF <= 100))
                System.out.println("A");  
            if((CALIF >= 80) && (CALIF <= 89))
                System.out.println("B");  
            if((CALIF >= 70) && (CALIF <= 79))
                System.out.println("C");
            if((CALIF >= 60) && (CALIF <= 69))
                System.out.println("D");  
            if(CALIF < 60)
                System.out.println("F");  
        } else 
            System.out.println(CALIF + " NOT VALID");
    }
}
