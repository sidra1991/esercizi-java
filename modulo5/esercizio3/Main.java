package modulo5.esercizio3;
/*Esercizio 5.3 – Year Testo:
Un’anno con 366 giorni è detto anno bisestile. Un anno è bisestile se è divisibile per quattro (per
esempio, il 1980), ma, dopo l’adozione del calendario gregoriano avvenuta il 15 ottobre 1582, un
anno non è bisestile se è divisibile per 100 (per esempio, il 1900), mentre è bisestile se è divisibile
per 400 (per esempio, il 2000). Scrivete un programma che chieda all’utente di inserire un anno e
che calcoli se l’anno è bisestile. Scrivere una classe Year con un metodo predicativo boolean
isLeapYear(). */

import java.util.Scanner;

public class Main {
    public static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("inserire anno per verificare che sia bisestile");
        int anno = controlNumber();


        if ( anno < 1582) 
        { 
            System.out.println(anno%4==0? "bisestile":"non bisestile");
        } 
        else 
        {
            if (anno%400==0) 
            {
                System.out.println("bisestile");
            }
            else if(anno%4 == 0 && !(anno%100 == 0 ))
            {
                System.out.println("bisestile");
            }
            else
            {
                System.out.println("non bisestile");
            }
        }
        
    }

    public static int controlNumber(){
        try {
            return scan.nextInt();
        } catch (Exception e) {
            System.out.println("numero non valido, inserire un nuovo valore");
            return controlNumber();
        }
    }
}
