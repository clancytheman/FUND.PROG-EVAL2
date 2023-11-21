package com.mycompany.eva2_33_arreglos_multidim2;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_33_ARREGLOS_MULTIDIM2 {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int[][][] cube = new int[3][4][6];
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube [i][j][k] = (int)(Math.random()* 100);
                    System.out.print("[" + cube[i][j][k] + "]");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
            System.out.println(" ");
        } 
    }
}
