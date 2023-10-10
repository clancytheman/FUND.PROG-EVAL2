package com.mycompany.eva2_3_numerospares;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_3_NUMEROSPARES {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner(System.in);
        int VALOR;
        int RESIDUO;
        System.out.println("INTRODUCE EL VALOR:");
        VALOR = CPTR.nextInt();
        RESIDUO = (VALOR % 2); // "%" --> Módulo, calcula el residuo.
        //
        if (RESIDUO == 0) { //VERDAD --> El número es par.
            System.out.println("ES NÚMERO PAR");
        }
        else {
            System.out.println("ES NÚMERO IMPAR");
        }
    // (0w0)
    }
}
