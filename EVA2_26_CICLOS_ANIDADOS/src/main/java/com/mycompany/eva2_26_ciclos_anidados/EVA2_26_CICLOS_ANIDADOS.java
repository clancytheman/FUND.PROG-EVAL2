package com.mycompany.eva2_26_ciclos_anidados;

import java.util.Scanner;

/**
 *
 * @author diego escarcega
 */
public class EVA2_26_CICLOS_ANIDADOS {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int NUMB;
        System.out.println("ENTER A NUMBER:");
        NUMB = CPTR.nextInt();
        for (int i = 1; i <= NUMB; i++) { // TRIANGULO
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println (" ");
        } 
        for (int i = NUMB; i >= 1; i--) { // BACKWARDS
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println (" ");
        }
        for (int i = 1; i <= 5; i++) { // ARBOLITO
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <=(2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println (" ");
            }
        }
    }
