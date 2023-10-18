package com.mycompany.eva2_8_else_if;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_8_ELSE_IF {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int MONTH;
        System.out.println("INGRESA NÚMERO DEL MES:");
        MONTH = CPTR.nextInt();
        //if ((MONTH >= 1) && (MONTH <= 12)){ // "((MONTH>0) & (MONTH<13))" <-- Exactamente el mismo resultado.
            //System.out.println(MONTH + " es un mes valido");
            if(MONTH ==1)
            System.out.println("ENERO");
            else if(MONTH ==2)
            System.out.println("FEBRERO");
            else if(MONTH ==3)
            System.out.println("MARZO"); 
            else if(MONTH ==4)
            System.out.println("ABRIL");
            else if(MONTH ==5)
            System.out.println("MAYO");
            else if(MONTH ==6)
            System.out.println("JUNIO");
            else if(MONTH ==7)
            System.out.println("JULIO");
            else if(MONTH ==8)
            System.out.println("AGOSTO");
            else if(MONTH ==9)
            System.out.println("SEPTIEMBRE");
            else if(MONTH ==10)
            System.out.println("OCTUBRE");
            else if(MONTH ==11)
            System.out.println("NOVIEMBRE");
            else if(MONTH ==12)
            System.out.println("DICIEMBRE");
            else
            System.out.println(MONTH + " no es un mes válido"); 
            System.out.println("DO IT AGAIN");
   }
}
