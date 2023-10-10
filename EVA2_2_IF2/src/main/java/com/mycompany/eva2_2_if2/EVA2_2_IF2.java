package com.mycompany.eva2_2_if2;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_2_IF2 {

    public static void main(String[] args) {
        System.out.println("¿QUÉ VALOR ES MÁS GRANDE?");
        System.out.println("(UwU)");
        Scanner CPTR = new Scanner (System.in);
        //Captura de valores.
        int V1;
        int V2;
        System.out.println("INTRODUCE EL VALOR 1:");
        V1 = CPTR.nextInt();
        System.out.println("INTRODUCE EL VALOR 2:");
        V2 = CPTR.nextInt();
        // Inicio de "IF"
        if (V1>V2) {
            System.out.println("EL VALOR MÁS GRANDE ES: " + V1);
        }
        else {
            if (V1 == V2) { //VERDAD --> Ambos valores son iguales.
                System.out.println("AMBOS VALORES SON IGUALES.");
            }
            else { 
                System.out.println("EL VALOR MÁS GRANDE ES: " + V2);
            }
        }
        
    }
}
