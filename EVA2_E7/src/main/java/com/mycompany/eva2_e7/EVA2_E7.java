package com.mycompany.eva2_e7;

import java.util.Scanner;

/**
 * @author DIEGO ESCARCEGA
 * 7. Solicitar un número positivo (o cero) al usuario. El programa estará preguntando
      números hasta que el usuario introduzca un número negativo. El programa deberá mostrar
      cual es el número más pequeño y el más grande de todos los que introdujo el usuario.
 */
public class EVA2_E7 {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        
        int NUMB;
        int smallNUMB = Integer.MAX_VALUE;
        int bigNUMB = Integer.MIN_VALUE;
        System.out.println("ENTER NUMBERS:"); 
        System.out.println("(To make the program stop asking, introduce a negative number)");
        while (true){                                  
            System.out.print("-> ");
            NUMB = CPTR.nextInt();           
            if (NUMB < 0){
                if (smallNUMB == Integer.MAX_VALUE){
                    System.out.println("THERE'S NO POSITIVE NUMBERS."); // <- MENSAJE POR SI EL USUARIO NO METIO POSITIVOS.
                } else{
                    System.out.println("MIN. NUMBER: " + smallNUMB);
                    System.out.println("MAX. NUMBER: " + bigNUMB);
                } break;
            }
                
            if (NUMB < smallNUMB){
                smallNUMB = NUMB;
            }
            if (NUMB > bigNUMB){
                bigNUMB = NUMB;
            }                   
        }
    }
}
