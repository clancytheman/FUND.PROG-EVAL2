package com.mycompany.eva2_13_tallas;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA 
 */
public class EVA2_13_TALLAS {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int TALLA;
        System.out.println("ENTER CLOTHE SIZE:");
        TALLA = CPTR.nextInt();
        
        switch (TALLA){
            case 29:
                System.out.println("SMALL");
                break;
            case 42:
                System.out.println("MEDIUM");
                break;    
            case 44:
                System.out.println("LARGE");
                break;
            case 48:
                System.out.println("XLARGE");
                break;
            default: 
                System.out.println(TALLA+ " NOT VALID");
        }
    }
}
