package com.mycompany.eva2_e2;

import java.util.Scanner;

/**
 * @author DIEGO ESCARCEGA
 * 2. Solicitar al usuario dos números enteros positivos, imprimir todos los números
      pares entre ellos.
 */
public class EVA2_E2 {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int NUMB, NUMB2;
        System.out.println("ENTER TWO NUMBERS:");
        System.out.print("1: "); NUMB = CPTR.nextInt();
        System.out.print("2: "); NUMB2 = CPTR.nextInt();        
        System.out.println("PAR NUMBERS INBETWEEN:");
        for (int i = NUMB; i <= NUMB2; i++) {
            if ((i % 2) != 0)
                continue;   
            System.out.println("-> " + i);   
        }
    }
}
