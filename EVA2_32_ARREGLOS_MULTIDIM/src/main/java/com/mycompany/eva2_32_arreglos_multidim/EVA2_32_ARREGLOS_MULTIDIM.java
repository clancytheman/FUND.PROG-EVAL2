package com.mycompany.eva2_32_arreglos_multidim;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_32_ARREGLOS_MULTIDIM {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int[][] matriz = new int[3][4];
        // DATOS MANUALES.
        matriz[1][3] = 100;
        System.out.println("MATRIZ [1][3]= " + matriz[1][3]);
        //--------------------------------------------------------
        // DATOS ALEATORIOS.
        System.out.println(matriz.length);
        for (int i = 0; i < matriz.length; i++) { // <--- PRIMER DIMENSION SON LAS FILAS.
            // POR CADA FILA, DEBO RECORRER LA COLUMNA --> OTRO CICLO FOR.
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()* 100);
                System.out.print("[ " + matriz[i][j] + " ]");
            }
                System.out.println(" ");
        }
    }
}
