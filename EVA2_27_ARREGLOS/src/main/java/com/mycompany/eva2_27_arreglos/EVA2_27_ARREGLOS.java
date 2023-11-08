/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_27_arreglos;

/**
 *
 * @author t3sts
 */
public class EVA2_27_ARREGLOS {

    public static void main(String[] args) {
       /* 
           1- Declaramos un arreglo que almacena 10 enteros.
           2- Acceso a los arreglos en aleatorio.
           3- Se accede a partir de un índice.
           4- El primer elemento es 0.
           5- La última posición es "n-1", "n" es el número del arreglo. 
        */
       int[] arregloEnteros = new int [10];
       // ACCEDER A VALORES DE UN ARREGLOS.
       arregloEnteros[0] = 100;
       arregloEnteros[1] = 200;
       arregloEnteros[2] = 300;
       arregloEnteros[3] = 400;
       arregloEnteros[4] = 500;
       arregloEnteros[5] = 600;
       arregloEnteros[6] = 700;
       arregloEnteros[7] = 800;
       arregloEnteros[8] = 900;
       arregloEnteros[9] = 1000;
       // Cada entero ocupa 4 bites, 10 enteros = 40 bites 
        System.out.println("VALOR EN LA POSICIÓN 0: " + arregloEnteros[0]);
        
        String[] arregloCade = new String[5];
        arregloCade[0] = "HELLO!";
        arregloCade[1] = "BOO!";
        arregloCade[2] = "SH*T!";
        arregloCade[3] = "NICE!";
        arregloCade[4] = "?!?!";
    }
}
