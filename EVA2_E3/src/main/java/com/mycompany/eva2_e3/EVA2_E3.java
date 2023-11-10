package com.mycompany.eva2_e3;

import java.util.Scanner;

/**
 * @author DIEGO ESCARCEGA
 * 3. Solicitar un número al usuario e imprimir la sumatoria de todos los números desde
      el 1 hasta el número que introdujo el usuario.
 */
public class EVA2_E3 {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        System.out.println("ENTER A NUMBER:");
        int NUM = CPTR.nextInt();
        int SUMA = 0;
        for (int i = 1; i <= NUM; i++) {
            System.out.println("-> " + i);
            SUMA += i;
        }
        System.out.println("SUM OF EVERY NUMBER: " + SUMA);
        }
        
}

