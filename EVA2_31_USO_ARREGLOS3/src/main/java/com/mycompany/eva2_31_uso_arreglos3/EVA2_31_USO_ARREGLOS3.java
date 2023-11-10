package com.mycompany.eva2_31_uso_arreglos3;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_31_USO_ARREGLOS3 {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        // GENERAR UN ARREGLO TAMAÑO 15.
        // LLENARLO DE VALORES ALEATORIOS.
        int[] arreglo = new int[15];
        for (int i = 0; i < 15; i++) {  
            arreglo[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < 15; i++) {
            System.out.print(" [" + arreglo[i] + "] ");
        }
        System.out.println(" ");
        System.out.println("¿QUÉ VALOR NECESITAS?");
        int VALOR = CPTR.nextInt();
        int POS = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (VALOR == arreglo[i]){
                POS = i;
                break;
            }
        }
        if (POS !=  -1)
        System.out.println("El valor está en la posición -> " + POS);
        else
            System.out.println("El valor no existe.");    
    }
}
