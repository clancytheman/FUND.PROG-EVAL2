package com.mycompany.eva2_20_whileretiros;

import java.util.Scanner;

/**
 * @author DIEGO ESCARCEGA
 */
public class EVA2_20_WHILERETIROS {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int $ = 1000;
        while($ > 0){ //Mientras haya saldo, se puede retirar.
            System.out.println("¿Cuánto deseas retirar?");
            int retiro = CPTR.nextInt();
            // Acumulador
            // $ = ($ - retiro).
            $ -= retiro;
            System.out.println("SALDO: " + $);
        }
    }
}
