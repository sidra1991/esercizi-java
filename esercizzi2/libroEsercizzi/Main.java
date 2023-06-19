package esercizzi2.libroEsercizzi;

import esercizzi2.libroEsercizzi.classi.NumeroIntero;

public class Main {
    public static void main(String[] args) {
        es2a();
    }

    public static void es2a(){
        /*
         * esercizio 2.a
         * 1. Scrivere, compilare ed eseguire una classe che:istanzierà almeno due oggetti dalla 
            classe NumeroIntero (contenente ovviamente un metodo main()), cambierà 
            il valore delle relative variabili e testerà la veridicità delle avvenute assegnazioni, 
            sfruttando il metodo stampaNumero().
         */

         NumeroIntero num1 = new NumeroIntero(2);
         NumeroIntero num2 = new NumeroIntero(5);
        /* 
         num1.numeroIntero = 3;
         num2.numeroIntero = 5;
        */
         num1.stampaNumero();
         num2.stampaNumero();;
    }
}
