package com.mycompany.eva2_19_whileinfinito;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_19_WHILEINFINITO {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int num = 100;
        int cptr = 0;
        while (true){ // <-- Ciclo infinito, por si solo, nunca se va a detener.
            System.out.println("Introduce un número:");
            cptr = CPTR.nextInt();
        if (cptr == num){
            System.out.println("Adivinaste");
            }
        break; // <-- Detiene la ejecución del ciclo
        }
    }
}
