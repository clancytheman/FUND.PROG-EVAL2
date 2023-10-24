package com.mycompany.eva2_10_carreras;

import java.util.Scanner;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_10_CARRERAS {

    public static void main(String[] args) {
        Scanner CPTR = new Scanner (System.in);
        String CARR;
        System.out.println("SELECCIONA UNA CARRERA:");
        System.out.println(
                  "-ISC" + " -INF" + " -IND" + " -IDI" + " -IGE" + " -LA" + " -ARQ");
        CARR = CPTR.nextLine();
        
        switch (CARR){
            case "ISC":
                System.out.println("Ingeniería en Sistemas Computacionales");
                break;
            case "INF":
                System.out.println("Ingeniería Informática");
                break;    
            case "IND":
                System.out.println("Ingeniería Industrial");
                break;
            case "IDI":
                System.out.println("Ingeniería en Diseño Industrial");
                break;
            case "IGE":
                System.out.println("Ingeniería en Gestión Empresarial");
                break;    
            case "LA":
                System.out.println("Licenciatura en Administración");
                break;
            case "ARQ":
                System.out.println("Arquitectura");
                break;
            default: 
                System.out.println(CARR+ " no es una carrera en ITCH II");
    }
    }
}
