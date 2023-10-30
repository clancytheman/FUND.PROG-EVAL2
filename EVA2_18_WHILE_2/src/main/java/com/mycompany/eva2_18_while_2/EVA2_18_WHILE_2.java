package com.mycompany.eva2_18_while_2;

import java.util.Scanner;

/**
 * @author DIEGO ESCARCEGA
 */
public class EVA2_18_WHILE_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num = 100;
        int cptr = 0;
        while(cptr != num){
            System.out.println("Introduce el número:");
            cptr = input.nextInt();
        if (cptr == num){
            System.out.println("Adivinaste");
            }
        }
    }
}
