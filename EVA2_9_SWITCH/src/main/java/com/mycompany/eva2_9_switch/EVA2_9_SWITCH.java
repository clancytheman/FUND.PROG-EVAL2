package com.mycompany.eva2_9_switch;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_9_SWITCH {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        int MONTH;
        System.out.println("ENTER MONTH (NUMBER):");
        MONTH = CPTR.nextInt();
        
        switch (MONTH){
            case 1:
                System.out.println("JANUARY");
                break; // <-- Termina
            case 2:
                System.out.println("FEBRUARY");
                break;    
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DECEMBER");
                break;
            default: // Opcional, no necesita un "break".
                System.out.println(MONTH + " not a valid month");
                
        }
    }
}

