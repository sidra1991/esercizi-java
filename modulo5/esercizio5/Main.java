package modulo5.esercizio5;

import java.util.Scanner;

import modulo5.esercizio5.classi.Convertitore;

/*Esercizio 5.5 – NumberConverter Testo:
Si scriva un metodo arabicToString che converta un numero nell’intervallo [1, 999.999] in una
stringa con il nome del numero in italiano. Ad es 247.247 viene convertito nella stringa
duecentoquarantasettemiladuecentoquarantasette.

Esercizio 5.6 – ArabicToRoman Testo:
Realizzare una classe con un metodo che converta un numero intero compreso tra 1 e 100 in un
numero romano (es: 57 diventa LVII).
Esercizio 5.7 – ArabicToRomanAvanzato Testo:
Realizzare un convertitore arabo – romano che sfrutti tutti i simboli romani disponibili nel codice
ASCII (I – V – X – L – C – D - M). Con questi simboli si possono scrivere tutti i numeri compresi tra 1
e 3999. */

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        
        Convertitore conv = new Convertitore();

        while (true) {
            System.out.println("inserire valore da cambiare");
            System.out.println(conv.arabicToString(controlloNumeri()));
        }
        
        
    }

    public static Long controlloNumeri() {
        if (scan.hasNextInt()) {
            return scan.nextLong();
        }else{
            scan.next();
            System.out.println("numero non valido riprovare");
            return controlloNumeri();
        }
    }

}
