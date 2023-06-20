package modulo4.esercizio2e3;
/*Esercizio 4.2 – TimeConverter Testo:
Scrivere un programma che, dato un certo tempo in giorni, ore, minuti e secondi, restituisca il
numero totale di secondi. */

public class Main {
    public static void main(String[] args) {
        int giorni = 70;
        int ore = 3;
        int minuti = 10;
        int secondi = 5;
        long secondiDaConvertire = calcoloSecondi(giorni, ore, minuti, secondi);
        System.out.println( secondiDaConvertire );
        convertitoreSecondi(secondiDaConvertire);
        
        
    }


    public static long calcoloSecondi(int giorni,int ore,int minuti, int secondi){
        int nuoveOre = ore + (giorni * 24);
        long nuoviMinuti = (long) (minuti + (nuoveOre * 60)); 
        return (long) ( secondi+ ( nuoviMinuti * 60) );
    }

    public static void convertitoreSecondi(long secondiDaConvertire){
        int secondi = (int)(secondiDaConvertire % 60);
        int minuti = (int)((secondiDaConvertire / 60) % 60 );
        int ore = (int)(((secondiDaConvertire / 60) / 60) % 24);
        int giorni = (int)(((secondiDaConvertire / 60) / 60) / 24);

        System.out.println(secondi + " secondi\n" + minuti + " minuti\n" + ore + " ore\n" + giorni + " giorni");
    }

}
