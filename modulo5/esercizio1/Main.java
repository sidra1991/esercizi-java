package modulo5.esercizio1;

import java.util.Scanner;

/*Esercizio 5.1 – InputChecker Testo:
Scrivere un programma che stampi la domanda “Vuoi continuare?” e che attenda dati dall’utente.
Se l’utente immette “S”, “Sì”, “Ok”, “Certo” o “Perché no?”, stampare “OK”. Se l’utente scrive “N”
o “No”, stampare “Fine”. Negli altri casi, stampare “Dato non corretto”. Non considerare
differenze tra maiuscolo e minuscolo, quindi anche “s” e “sì” sono validi. */

public class Main {
    public static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        while (true) {
            System.out.println("vuoi continuare?");
            if (conferma()) {
                System.out.println("ok");
                continue;
            }else{
                System.out.println("fine");
                break;
            }

        }

        
    }
    

    public static boolean conferma(){

        String response = "";


        try {
            response = scan.next().toUpperCase();
        } catch (Exception e) {
            System.out.println("Dato non corretto");
            return conferma();
        }

        if (response.equals("CERTO")||
                response.equals("PERCHE NO?")||
                response.equals("OK")||
                response.equals("Si")||
                response.equals("S")||
                response.equals("YES")||
                response.equals("Y") ) 
        {
            return true;
        }
        else if(response.equals("NO")||
                response.equals("N"))
        {
            return false;
        }
        else
        {
            System.out.println("Dato non corretto");
            return conferma();
        }

    }
}
