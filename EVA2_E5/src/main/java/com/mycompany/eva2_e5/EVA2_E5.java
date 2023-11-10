package com.mycompany.eva2_e5;

import java.util.Scanner;

/**
 * @author DIEGO ESCARCEGA
 * 5. Solicitar al usuario dos números enteros positivos. El primero es la base, el segundo
      es el exponente. Usando ciclos, calcular la potencia de la base elevada al exponente.
 */
public class EVA2_E5 {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        System.out.print("INTRODUCE LA BASE: ");
        int BASE = CPTR.nextInt();
        System.out.print("INTRODUCE EL EXPONENTE: ");
        int EXP = CPTR.nextInt();
        int RESULT = 1;
        for (int i = 1; i <= EXP; i++) 
            RESULT *= BASE;      
        System.out.println(BASE + " ELEVADO A " + EXP + " ES IGUAL A: " + RESULT);
    }
}

