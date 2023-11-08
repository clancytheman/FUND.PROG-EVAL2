package com.mycompany.eva2_28_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCRACEGA
 */
public class EVA2_28_USO_ARREGLOS {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int CANT;
        int[] CALIF; // <- No existe el arreglo, solo hasta el "new".
        System.out.println("CAPTURE HOW MANY GRADES:");
        CANT = CPTR.nextInt();
        // Ya que sabemos cuantas calificacines capturará el usuario, creamos el arreglo.
        CALIF = new int [CANT]; // <- Arreglo creado!
        for (int i = 0; i < CANT; i++) {
            System.out.println("ENTER GRADE:");
            System.out.print("-> ");
            CALIF[i] = CPTR.nextInt();
        }
        System.out.println("------------");
        System.out.println("YOUR GRADES:");
        for (int i = 0; i < CANT; i++) {            
            System.out.print("[" + CALIF[i] + "]");
        }
        
    }
}
