package facili;

public class EsercizioMassimo {

    public static void main(String[] args) {
        int x = 10;
        int y = 110;


        if (x >= y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

//  =========================================================================

        int result = metodo(3, 7);
        int result2 = metodo(5, 3);
        int result3 = metodo(10, 7);
        int result4 = metodo(8, 7);
        int result5 = metodo(100, 63);
        int result6 = metodo(80, 2);
    }

         static int metodo(int a, int b) {

             if (a >= b) {
                 System.out.println(a);
                 return (a);
             }
             else {
                 System.out.println(b);
                 return (b);
             }


         }


        //TODO stampa a schermo il numero più grande

        //implementazione



        //TODO estrai l'implementazione in un metodo e esegui 10 valutazioni diverse


}
