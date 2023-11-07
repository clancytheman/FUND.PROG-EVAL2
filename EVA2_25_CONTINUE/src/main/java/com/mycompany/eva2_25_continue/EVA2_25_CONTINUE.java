package com.mycompany.eva2_25_continue;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_25_CONTINUE {

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++){
            if (i == 7)
                continue; // <-- PERMITE CONTINUAR EL CICLO. 
            System.out.println(" |- " + i);
        }
        System.out.println(" ");
        for (int i = 1; i <= 15; i++){
            if (i == 7)
                break; // <-- DETIENE POR COMPLETO LA EJECUCIÓN DEL CICLO.
            System.out.println(" |- " + i);
        }
        System.out.println(" ");
        for (int i = 1; i <= 20; i++){
            if ((i % 2) != 0)
                 continue; 
            System.out.println(" |- " + i);
        }
    }
}
