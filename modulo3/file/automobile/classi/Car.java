package modulo3.file.automobile.classi;

public class Car {
    private double fuelYield;
    private double gas;

    public Car(double fuelYield){
        this.fuelYield = fuelYield;
        this.gas = 0;
    }

    public void drive(double km){
        double calcolo = this.gas - (this.fuelYield * km);
        
        if(calcolo > 0){
            System.out.println("viaggio riuscito");
            this.gas = calcolo;
        }else {
            System.out.println("viaggio non possibile, poco carburante");
        }
    }

    public void getGas(){
        System.out.println("il serbatoglio contiene " + gas);
    }

    public void addGas(double gas){
        System.out.println("rifornimento riuscito");
        this.gas += gas;
    }
}
