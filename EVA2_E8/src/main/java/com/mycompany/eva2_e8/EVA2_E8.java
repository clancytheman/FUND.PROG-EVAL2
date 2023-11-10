package com.mycompany.eva2_e8;

import java.util.Scanner;

/**
 * @author DIEGO ESCARCEGA
 * 8. Solicitar caracteres alfabéticos al usuario, indicar si es vocal o consonante. El
      programa termina cuando se introduzca un espacio en blanco.
 */
public class EVA2_E8 {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);       
        System.out.println("ENTER LETTERS:");
        while (true){
            String LETRA = CPTR.nextLine();
            if (LETRA.equals(" ")){
                break;
            }
            switch (LETRA.toLowerCase()){
                case "a", "e", "i", "o", "u":
                    System.out.println("VOCAL");
                    break;
                case "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n":
                case "p", "q", "r", "s", "t", "v", "w", "x", "y", "z":
                    System.out.println("CONSONANT");
                    break;
                default:
                    System.out.println("NOT A LETTER/SINGLE LETTER");
                    break;
            }
        }
    }
}

