package modulo3.file.c3.classi;

public class Car {
    private double fuelYield;
    private double gas;

    public Car(double fuelYield){
        this.fuelYield = fuelYield;
        this.gas = 0;
    }

    public void drive(double km){
        this.gas -= this.fuelYield * km;
    }

    public void getGas(){
        System.out.println("il serbatoglio contiene " + gas);
    }

    public void addGas(double gas){
        this.gas += gas;
    }
}
