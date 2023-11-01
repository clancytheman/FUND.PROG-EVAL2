package com.mycompany.eva2_21_do_while;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_21_DO_WHILE {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int VAL;
        do{
            System.out.println("Introduce un valor:");
            VAL= input.nextInt();
        } while(VAL != 100);
            
    }
}
