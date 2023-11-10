package com.mycompany.eva2_30_uso_arreglos2;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_30_USO_ARREGLOS2 {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        String[] listProd = new String[10];
        listProd[0] = "BURRITOS";
        listProd[1] = "TORTAS";        
        listProd[2] = "TORTA AHOGADA";
        listProd[3] = "TAMALES";
        listProd[4] = "ORDEN TRIPITAS";
        listProd[5] = "ORDEN BARBACOA";
        listProd[6] = "CHILAQUILES";
        listProd[7] = "AGUA";
        listProd[8] = "REFRESCO";
        listProd[9] = "SALSA/INGREDIENTE EXTRA";
        
        
        double[] listPrecios = {20, 35, 45, 20, 75, 85, 55, 15, 25, 5};
        System.out.println("}---------MENU---------{");
        for (int i = 0; i < listProd.length; i++) {
            System.out.println("- " + listProd[i] + ": $" + listPrecios[i]);            
        }
        System.out.println("}----------------------{");
        System.out.println(" ");
        int OPT, CANT;
        System.out.println("¿Qué deseas ordenar?");
        OPT = CPTR.nextInt();
        System.out.println("¿Cuántos?");
        CANT = CPTR.nextInt();
        System.out.println(" ");
        System.out.println("TOTAL : $" + (CANT * listPrecios[OPT]));
        
    }
}
