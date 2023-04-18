package facili;

public class EsercizioDoppio {

    public static void main(String[] args) {
        int x = 10;

        System.out.println(10 * 2);


        int esercizio = moltiplicazione(2);
        int esercizio1 = moltiplicazione(3);
        int esercizio2 = moltiplicazione(4);
        int esercizio3 = moltiplicazione(5);
        int esercizio4 = moltiplicazione(21);
        int esercizio5 = moltiplicazione(36);
        int esercizio6 = moltiplicazione(63);
        int esercizio7 = moltiplicazione(101);

        System.out.println(esercizio);
        System.out.println(esercizio1);
        System.out.println(esercizio2);
        System.out.println(esercizio3);
        System.out.println(esercizio4);
        System.out.println(esercizio5);
        System.out.println(esercizio6);
        System.out.println(esercizio7);


    }

    static int moltiplicazione(int x){
        int y = 2;
        int risultato = x * y;
        return(risultato);
    }

     //TODO stampa a schermo il doppio di x
            //implementazione
        //TODO estrai l'implementazione in un metodo e esegui 10 doppi diversi


}

