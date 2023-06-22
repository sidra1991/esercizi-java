package modulo5.esercizio5.classi;

public class Convertitore {
    private int decineDiMigliaglia;
    private int centinaiaDiMigliaglia;
    private int migliaglia;
    private int centinaia;
    private int decine;
    private int unita;
    private String conversioneInString;


    private void nuovoNumero(long numeroIntero){
        String[] converter =  Long.toString(numeroIntero).split("");
        this.unita = Integer.parseInt(converter[converter.length -1]);
        this.conversioneInString = "";
        if(converter.length >= 2){
            this.decine = Integer.parseInt(converter[converter.length -2]);
        }else{
            this.decine = 0;
        }

        if(converter.length >= 3){
            this.centinaia = Integer.parseInt(converter[converter.length -3]);
        }else{
            this.centinaia = 0;
        }

        if(converter.length >= 4){
            this.migliaglia = Integer.parseInt(converter[converter.length -4]);
        }else{
            this.migliaglia = 0;
        }

         if(converter.length >= 5){
            this.decineDiMigliaglia = Integer.parseInt(converter[converter.length -5]);
        }else{
            this.decineDiMigliaglia = 0;
        }

         if(converter.length >= 6){
            this.centinaiaDiMigliaglia = Integer.parseInt(converter[converter.length -6]);
        }else{
            this.centinaiaDiMigliaglia = 0;
        }

        System.out.println("numero pronto per essere convertito");
    }
    

    public String arabicToString(Long nuovoNumero){
        this.nuovoNumero(nuovoNumero);
        this.conversioneInString += this.centinaiaDiMigligliaStringa();
        this.conversioneInString += this.decineDiMigligliaStringa(); 
        this.conversioneInString += this.migligliaStringa();
        this.conversioneInString += this.centinaiaStringa(this.centinaia);
        this.conversioneInString += this.decineStringa(this.decine);
        this.conversioneInString += this.unitaInStringa(this.unita);
        return this.conversioneInString;
    }

    private String unitaInStringa(int numero){
        String[] unitaStringhe = {"zero","uno","due","tre","quattro","cinque","sei","sette","otto","nove"};
        if(numero == 0){
            if (this.decine == 0 && this.centinaia ==0 && this.migliaglia == 0 &&this.decineDiMigliaglia == 0 ) {
                return unitaStringhe[numero];
            }else{
                return "";
            }
            
        }

        if(this.decine == 1){
            //tra 10 e 19 ci sono troppe eccezioni che verranno gestite a parte
            return "";
        }
        
        return unitaStringhe[numero];
    }

    private String decineStringa(int numero){
        String[] decineInStringa = {"","dieci","venti","trenta","quaranta","cinquanta","sessanta","settanta","ottanta","novanta"};
        if (numero ==1 && this.unita > 0) {
            return eccezioniDelDieci();
        }

        return decineInStringa[numero];
    }

    private String eccezioniDelDieci(){
        switch (this.unita) {
            case 1:
                return "undici";
            case 2:
                return "dodici";
            case 3:
                return "tredici";
            case 4: 
                return "quattordici";
            case 5:
                return "quindici";
            case 6:
                return "sedici";
            case 7:
                return "diciasette";
            case 8:
                return "diciotto";
            case 9: 
                return "diciannove";
            default: return "";
            
        }
    }

    private String centinaiaStringa(int numero){
        if( numero == 0){
            return "";
        }else if(numero > 1){
            return this.unitaInStringa(numero)+"cento";
        }else{
            return "cento";
        }
    }

    private String migligliaStringa(){
        if(this.decineDiMigliaglia == 0 && this.centinaiaDiMigliaglia == 0){
            if( this.migliaglia == 0){
                return "";
            }else if(this.migliaglia > 1){
                return this.unitaInStringa(this.migliaglia)+"mila";
            }else{
                return "mille";
            }
        }
        
        return "";

    }

    private String decineDiMigligliaStringa(){
        if( this.centinaiaDiMigliaglia == 0){
            if( this.decineDiMigliaglia == 0){
                return "";
            }else if(this.decineDiMigliaglia == 1){
                return this.decineStringa(this.decineDiMigliaglia)+"mila";
            }else if(this.decineDiMigliaglia > 1){
                return this.decineStringa(this.decineDiMigliaglia)+"mila";
            }else{
                return "mille";
            }
        }
        return "";
    }

        private String centinaiaDiMigligliaStringa(){
        if( this.centinaiaDiMigliaglia == 0){
            return "";
        }else if(this.centinaiaDiMigliaglia == 1){
            return this.centinaiaStringa(this.centinaiaDiMigliaglia)+"mila";
        }else if(this.centinaiaDiMigliaglia > 1){
            return this.centinaiaStringa(this.centinaiaDiMigliaglia)+"mila";
        }else{
            return "mille";
        }
    }
    
}
