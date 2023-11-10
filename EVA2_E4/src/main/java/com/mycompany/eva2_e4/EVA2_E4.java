package com.mycompany.eva2_e4;

import java.util.Scanner;

/**
 * @author DIEGO ESCARCEGA
 * 4. Solicitar un número al usuario, indicar si el número es positivo, negativo o cero.
      Después de solicitar el número y darle la respuesta al usuario, se le debe preguntar si desea
      terminar el programa. 
 */
public class EVA2_E4 {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        OUTER:
        while (true) { //Este "while" sirve para repetir el ciclo en caso del "no".
            
            //SECCIÓN DEL NÚMERO.
            System.out.println("ENTER A NUMBER:");
            int NUM = CPTR.nextInt();
            if (NUM >0)
                System.out.println("POSITIVE NUMBER.");
             else if (NUM < 0)
                System.out.println("THAT'S A NEGATIVE NUMBER.");
             else 
                System.out.println("IT'S A ZERO (._ .)");
            
            
            //SECCIÓN PARA TERMINAR EL PROGRAMA.
            System.out.println(" ");
            System.out.println("DO YOU WANT TO FINISH THE PROGRAM?");
            String ANSWR = CPTR.next();
            switch (ANSWR){ 
                case "YES", "yes", "SI", "si" -> {
                    break OUTER;
                }
                case "NO", "no" -> {
                    System.out.println("CONTINUE...");
                    System.out.println(" ");
                    continue;
                }
                default -> {
                    System.out.println("what? try again...");
                    System.out.println(" ");
                    continue;
                }
            }
        }
    }        
}
