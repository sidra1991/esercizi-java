
package esercizzi2.fileEsercizzi;
/*esercizio
 * CAPITOLO 2 - Utilizzare oggetti

    Esercizio 2.1 – Rettangolo Testo:
    Si costruisce un rettangolo partendo da una base, un’altezza e dalle coordinate del piano.
    Esercizio 2.2 – Dado Testo:
    Scrivere un programma che usi la classe Random per simulare il lancio di un dado, visualizzando un
    numero casuale compreso tra 1 e 6 ogni volta che viene eseguito.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      creaRettangolo(scan);
      double random = (Math.random()*5)+1;
      System.out.println(" il numero random tra 1 e 6 è " + Math.round(random));
      scan.close();
    }


    public static void creaRettangolo(Scanner scan){
      System.out.println("inserire base rettangolo (numero intero)");
      int base = controlloNumero(scan);
      System.out.println("inserire altezza rettangolo (numero intero)");
      int altezza = controlloNumero(scan);
      System.out.println("inserire coordinate asse y (numero intero)");
      int y = controlloNumero(scan);
      System.out.println("inserire coordinate asse x (numero intero)");
      int x = controlloNumero(scan);
      rettangolo(base, altezza, x, y);
    }

    public static int controlloNumero(Scanner scan){
      if (scan.hasNextInt()) {
            return scan.nextInt();
      }else{
         System.out.println("errore, inserire un numero valido intero");
         return controlloNumero(scan);
      }
    }


    public static void rettangolo(int base, int altezza, int x, int y){
      String baseStringa = "";
      String altezzaStringa = "";
      String yStringa ="";
      String distanziatoreAltezza = "";
      String xStringa = "";

      // aggiuinge i distanziatori per raggiungere il punto del asse delle Y
      for (int i = 0; i <= y; i++) {
         yStringa = yStringa + "-\n";
      }

      // aggiunge i distanziatori per raggiungere il punto delle asse delle x
      for(int i = 0; i <= x; i++){
         xStringa = xStringa + ".";
      }

      // fornisce la distanza tra le due pareti destra e sinistra del rettangolo
      for (int i = 0; i < base-1; i++) {
         distanziatoreAltezza = distanziatoreAltezza + " ";
      }


      //crea i caratteri necessari per fornire la struttura grafica del sopra e del sotto del rettangolo
      for (int i = 0; i <= base; i++) {
         if(i == 0 || i == base){
            baseStringa = baseStringa + (i == 0? xStringa:"") + "+" + (i == base?"\n":"") ;
         }else{
            baseStringa = baseStringa + "-";
         }
      }

      //fornisce la struttura grafica delle pareti laterali del rettangolo
      for (int i = 0; i <= altezza; i++) {
         altezzaStringa = altezzaStringa + xStringa + "|" + distanziatoreAltezza + "|\n";
      }

      //stampa la grafica del rettangolo raggiunge prima il punto delle assi Y poi stampa il disegno tenendo conto del asse delle x
      System.out.println( yStringa + baseStringa + altezzaStringa + baseStringa );
    }
}
