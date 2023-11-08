package com.mycompany.eva2_29_arreglos2;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_29_ARREGLOS2 {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int[] arreglo = new int[20];
        //Arreglo de valores entre 0 y 99.
        for (int i = 0; i < 20; i++) {
                         // "Casting" --> Convierto un double a un entero.   
            arreglo[i] = (int)(Math.random() * 100);
        }
        
        for (int i = 0; i < 20; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
    }
}
