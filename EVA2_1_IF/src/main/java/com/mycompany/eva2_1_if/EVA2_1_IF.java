package com.mycompany.eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_1_IF {

    public static void main(String[] args) {
       int CALIF;
       
      Scanner input = new Scanner (System.in);
        System.out.println("Introduce la calificación:");
        CALIF = input.nextInt();
        if(CALIF >= 70){
            //Las llaves se usan cuando hay más de una instrucción.
            System.out.println("APRUEBA");
            System.out.println("FELICIDADES!!!");}
        
        else{   //"else" = "si no". Es opcional, no es necesario.
                //Se usan llaves de la misma manera que con "if".     
            System.out.println("REPRUEBA");
            System.out.println("INTENTALO OTRA VEZ");}
        
        System.out.println("fin del programa");
    }
}