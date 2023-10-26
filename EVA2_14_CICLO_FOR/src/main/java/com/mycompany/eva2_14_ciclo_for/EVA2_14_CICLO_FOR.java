package com.mycompany.eva2_14_ciclo_for;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_14_CICLO_FOR {

    public static void main(String[] args) {
        /* 
        for --> "desde"
        se ejecuta desde un punto hasta otro
        for (punto de inicio; condición para el término; manera de avanzar (o retroceder))
        */
        for (int i = 0; i < 10; i++){ // "++" <-- operador de incremento en 1
            System.out.println(i);
        }
        System.out.println("------------------------------");
        for (int i = 9; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("---NUMEROS PARES DE 0 A 100---");
        for (int i = 0; i <= 100; i+=2){
            System.out.print("|" + i);
        }
    }
}
