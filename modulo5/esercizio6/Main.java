package modulo5.esercizio6;

import java.util.Scanner;

import modulo5.esercizio6.classi.Convertitore;

/*
 * Esercizio 5.6 – ArabicToRoman Testo:
    Realizzare una classe con un metodo che converta un numero intero compreso tra 1 e 100 in un
    numero romano (es: 57 diventa LVII).
 */
public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Convertitore convertitore = new Convertitore();

        /* 
        while (true) {
            System.out.println("inserire valore da cambiare");
            convertitore.nuovoNumero(controlloNumeri());
        }
        */
        int index = 0;
        while (true) {
            convertitore.nuovoNumero(index);
            if(index % 10 ==0 ){
                System.out.println("");
            } 

            if(index == 20){
                break;
            }
            index++;
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
