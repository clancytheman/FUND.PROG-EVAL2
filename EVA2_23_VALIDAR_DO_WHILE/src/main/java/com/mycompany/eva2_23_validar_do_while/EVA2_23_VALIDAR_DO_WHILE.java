package com.mycompany.eva2_23_validar_do_while;

import java.util.Scanner;

/**
 * @author DIEGO ESCARCEGA
 */
public class EVA2_23_VALIDAR_DO_WHILE {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int VAL;
        do{
            System.out.println("Introduce un valor entero:");
             if (CPTR.hasNextInt()) {
                VAL = CPTR.nextInt();
                System.out.println("Es un número entero.");
            } else {
                 System.out.println("No es un número entero.");
                break;
            }
        } while (true);
    }
}
