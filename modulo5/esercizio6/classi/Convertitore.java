package modulo5.esercizio6.classi;

public class Convertitore {
    public Long numero;
    private String[] lettere = new String[]{"L","X","V","I"};
    private int[] valori = new int[]{50,10,5,1};
    private long numeroPartenza;


    public void nuovoNumero(long numeroIntero){
        this.numero = numeroIntero;
        numeroPartenza = numeroIntero;
        calcola();
    }

    private void calcola(){
        String contoRomano = ""; 

        //simbolo l
        contoRomano += contoGeneralizzato("L",39,50);

        //simbolo X
        contoRomano += contoGeneralizzato("X",8,10);

        // simbolo V
        contoRomano += contoGeneralizzato("V",3,5);

        //simbolo |
        contoRomano += ripetizioni(this.numero, "I",1);

       System.out.println( numeroPartenza + " = " + contoRomano + " // ");
    }

    public void sottrazione(String simbolo ,int valore){
        int next = this.lettere.length-1;
        if(this.numero > 10 ) {
            for (int i = 0; i < lettere.length; i++) {
                if (this.lettere[i].equals(simbolo) && next > i) {
                    next = i-1;
                    break;
                }
            }
        }
        System.out.println(simbolo + " " + valore);
        if(this.valori[next] <= valore){
            //this.numero += this.valori[next];
        }
    }

    private String ripetizioni(Long num , String sim , int val){
        
        String text = "";
        while(true){
            if( num <= 0){
                return text; 
            }

            if(num >= val){
               
                text += sim;
                num -= val;
            }
        }
    }

    private String contoGeneralizzato(String simbolo,int minimo,int valoreSimbolo){
        String contoRomano = "";

        int next = this.lettere.length-2;
        if(this.numero > 10){
            for (int i = 0; i < lettere.length; i++) {
                if (this.lettere[i].equals(simbolo) && next > i) {
                    next = i;
                    break;
                }
            }
        }
        while(true){
            if(this.numero <=minimo){
                return contoRomano;
            }
            if(this.numero >=  valoreSimbolo){
                contoRomano += simbolo ;
                this.numero-= valoreSimbolo;
            }else if(this.numero <= valoreSimbolo && this.numero >= minimo ){
                this.numero -= this.valori[next];
                sottrazione( this.lettere[next+1]  ,this.valori[next+1]);
                contoRomano +=this.lettere[next+1]+ simbolo ;
            }
        }
    }
}
