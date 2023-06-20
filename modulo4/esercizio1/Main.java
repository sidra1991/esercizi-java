package modulo4.esercizio1;

/*
 * Esercizio 4.1 – PowerGenerator Testo:
    Scrivere un programma che stampi i seguenti valori:
    1
    10
    100
    1000
    10000

    100000
    1000000
    10000000
    100000000
    1000000000
    10000000000
    100000000000
 */

public class Main {
    public static void main(String[] args) {
        long number = 1;
        while (true) {
            System.out.println(number);

            if(number == 100000000000L){
                break;
            }

            number *= 10;
        }
    }
}
