/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_operaciones;

/**
 *
 * @author DIEGO ESCARCEGA
 */
public class EVA2_5_OPERACIONES {

    public static void main(String[] args) {
        //OPERADOR --> Símbolo que ejecuta alguna acción.
        //SUMA.
        int suma, VAL1, VAL2;
        VAL1 = 11;
        VAL2 = 2;
        suma = (VAL1 + VAL2); // <-- suma aritmética.
        System.out.println("SUMA --------------------|");
        System.out.println("La suma es = " + suma); // <-- concatenación.
        //RESTA.
        int resta;
        resta = (VAL2 - VAL1);
        System.out.println("RESTA -------------------|");
        System.out.println("La resta es = " + resta);
        //MULTIPLICACIÓN.
        int multi;
        multi = (VAL1 * VAL2);
        System.out.println("MULTIPLICAIÓN -----------|");
        System.out.println("La multiplicación es = " + multi);
        //DIVISIÓN.
        int divi;
        divi = (VAL1 / VAL2);
        System.out.println("DIVISIÓN ----------------|");
        System.out.println("La división es = " + divi); //El valor saldrá en entero porque las variables son "int".
        //--------
        double divi2;
        divi2 = (VAL1 / VAL2);
        System.out.println("La división es = " + divi2); //Aún sale erronea dado a que las variables de valores aún son "int".
        //---------
        double val2 = 2;
        divi2 = (VAL1 / val2);
        System.out.println("La división 11/2.0 = " + divi2); //Ahora sale la división correctamente.
        //int divi2 = 11/2.0; <--- Perdida de información, en el "2.0".
        //POTENCIA. (No hay operador de potencia)
        double Potencia = Math.pow(3, 3);
        System.out.println("POTENCIA ----------------|");
        System.out.println("3 elevado a la 3 = " + Potencia);
        //RAÍZ. (No hay operador de raíz)
        double Raiz = Math.pow(100, 0.5);
        System.out.println("RAÍZ --------------------|");
        System.out.println("La raíz cuadrada de 100 = " + Raiz);
        /*
        PRECEDENCIA DE OPERADORES=
        1. () Parentesís.
        2. Potencias/Raices.
        3. * / Multiplicación/División.
        4. + - Suma/Resta.
        */
        double Op, x=3, y=2, z=5;
        Op = ((x * z) + (x * y) / 2 - (y - z));
           //((15) + (6) / 2 - (-3)):
           //(15 + 3 - (-3)):
           //(15 + 3 + 3): 21
        System.out.println("OPERACIÓN -----------------|");   
        System.out.println("El resultado es = " + Op);
        //FORMULA GENERAL.
        double Op2, a=3, b=9, c=3;
        Op2 = ((-b) - Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a);
        System.out.println("FORMULA CUADRATICA --------|");
        System.out.println("El resultado es = " + Op2);  
    }
}
