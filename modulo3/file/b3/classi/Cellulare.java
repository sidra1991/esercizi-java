package modulo3.file.b3.classi;

public class Cellulare {
    private double carica;
    private int numeroChiamate;
    public double costo;

    public Cellulare(double unaCarica){
        this.carica = unaCarica;
        this.costo = 0.20;
        azzeraChiamate();
    }

    public void ricarica(double unaRicarica){
        this.carica += unaRicarica;
    }

    public void chiama(double minutiDurata){
        this.numeroChiamate++;
        this.carica -= this.costo * minutiDurata;
    }

    public double numero404(){
        return this.carica;
    }

    public int getNumeroChiamate(){
    return this.numeroChiamate;
    }

    public void azzeraChiamate(){
        this.numeroChiamate = 0;
    }
}
