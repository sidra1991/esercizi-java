package modulo3.file.c3.classi;

public class DistributoreBenzina {
    private double deposito;
    private double euroPerLitro;
    
    public DistributoreBenzina( double euroPerLitro){
        this.euroPerLitro =  euroPerLitro;
        this.deposito = 0;
    }

    public void rifornisci(double unaQuantita){
        this.deposito += unaQuantita;
    }

    public void vendi(double euro, Car unaAutomobile){
        double gas = euro / euroPerLitro;
        unaAutomobile.addGas(gas);
        deposito -= gas;
    }

    public void aggiorna(double unPrezzoPerLitro){
        this.euroPerLitro = unPrezzoPerLitro;
    }
}
