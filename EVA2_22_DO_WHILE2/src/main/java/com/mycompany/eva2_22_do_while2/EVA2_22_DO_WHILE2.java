package com.mycompany.eva2_22_do_while2;

import java.util.Scanner;

/**
 * @author  DIEGO ESCARCEGA
 */
public class EVA2_22_DO_WHILE2 {
    final static String NOMBRE_USUARIO = "Admin";
    final static String PASSWORD = "483005";

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        String usr;
        String pwd;
        do{
            System.out.println("USER:");
            usr = CPTR.nextLine ();
            System.out.println("PASSWORD:");
            pwd = CPTR.nextLine ();
        }while((!usr.equals(NOMBRE_USUARIO)) || (!pwd.equals(PASSWORD)));
        System.out.println(" ");
        System.out.println("WELCOME");
    }
}
