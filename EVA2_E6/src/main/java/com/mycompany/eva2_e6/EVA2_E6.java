package com.mycompany.eva2_e6;

import java.util.Scanner;

/**
 * @author DIEGO ESCARCEGA
 * 6. Solicitar un número entero positivo al usuario e imprimir el equivalente en sistema
      binario.
 */
public class EVA2_E6 {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int NUMB, RSD; //Número decimal y residuo para ayudarme a convertir en binario.
        System.out.print("ENTER A NUMBER: ");
        NUMB = CPTR.nextInt();
        String BINARY = " "; // "String" para almacenar los números del resultado en binario.
        while (NUMB != 0){
            RSD = (NUMB % 2); // Residuo de los números entre 2.
            BINARY = RSD + BINARY; // Agrega los números del residuo a la izquierda para leerse en binario. 
            NUMB /= 2; // Divido entre 2 para ir al siguiente digito en binario.
        }
        System.out.println("IN BINARY: " + BINARY);
    } // {._.}7
}
