package facili;

public class EsercizioPariODispari {

    public static void main(String[] args) {
        int x = 10;

        if (x % 2 == 0) {
            System.out.println(x + " è pari e vale 10");
        }
            else{
            System.out.println(x + " è dispari e vale 17");
        }


        //TODO stampa a schermo :
        //se pari: "x è pari, e vale 10"
        //se dispari: "x è dispari, e vale 17"
        //implementazione
        //TODO estrai l'implementazione in un metodo e esegui 10 valutazioni diverse


        valut(12);
        valut(3);
        valut(74);
        valut(5);
        valut(1133);
        valut(9);
    }

    static void valut(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " è pari");
        } else {
            System.out.println(x + " è dispari");
        }
    }


}
