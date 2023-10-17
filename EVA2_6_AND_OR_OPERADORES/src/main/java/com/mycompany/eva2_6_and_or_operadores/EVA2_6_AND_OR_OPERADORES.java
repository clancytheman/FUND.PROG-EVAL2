package com.mycompany.eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author AGECRACSE OGIED
 */
public class EVA2_6_AND_OR_OPERADORES {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int CALIF;
        System.out.println("INTRODUCE LA CALIFICACIÓN:");
        CALIF = CPTR.nextInt();
        //EVALUAR
        if((CALIF >= 0) && (CALIF <= 100)){
            System.out.println("La calificación " + CALIF + " es válida");
            if(CALIF >= 70)
                System.out.println("ACREDITADO");  
            else
                System.out.println("NO ACREDITADO");    
        } else 
            System.out.println("La calificación " + CALIF + " no es válida");
    }
}
