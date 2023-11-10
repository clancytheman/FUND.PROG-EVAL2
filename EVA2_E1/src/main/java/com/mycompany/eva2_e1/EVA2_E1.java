package com.mycompany.eva2_e1;

import java.util.Scanner;

/**
 * @author DIEGO ESCARCEGA
 * 1. Solicitar al usuario dos números enteros positivos, imprimir todos los números
      entre ellos en orden ascendente.
 */
public class EVA2_E1 {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int NUMB, NUMB2;
        System.out.println("ENTER TWO NUMBERS:");
        System.out.print("1: ");NUMB = CPTR.nextInt();
        System.out.print("2: ");NUMB2 = CPTR.nextInt();
        System.out.println("EVERY NUMBER INBETWEEN:");
        for (int i = NUMB; i <= NUMB2; i++) {            
            System.out.println("-> " + i);
            }      
    }
}
