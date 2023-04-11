package difficili.blackjack;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //necessario per prendere l'input dall'utente
        int puntata = 0;
        int soldi = 100;

        while (soldi > 0) {
            /*TODO:
            * - stampare i soldi attualmente disponibile
            * - chiedere quanti soldi si vuole puntare
            * - verificare se la puntata richiesta è <= ai soldi posseduti e ricominciare il ciclo se non è così
            * - sottrare la puntata dai soldi
            * - dare due carte al giocatore
            * - stampare le carte del giocatore e il suo punteggio
            *  */

            Giocatore giocatore = new Giocatore();
            Mazzo mazzo = new Mazzo();
            mazzo.mescola();
            giocatore.riceviCarta(mazzo.estraiCarta());
            giocatore.riceviCarta(mazzo.estraiCarta());
            int punteggio = giocatore.getPunteggio();

            boolean finito = false; // flag necessario per gestire la chiusura della partita
            while (punteggio < 21 && !finito) {
                /*TODO:
                 * - chiedere se si vuole un'altra carta e aggiungerne una se è premuto S e ricominciare il ciclo finché non viene premuto N
                 *  */
                char risposta = input.next().charAt(0);
                if (risposta == 's') {
                    /*TODO:
                     * - aggiungerne carta
                     *  */
                } else if (risposta == 'n') {
                    /*TODO:
                     * - chiudere il ciclo
                     *  */
                    finito = true;
                }
            }
            if (punteggio > 21) {
                /*TODO:
                 * - stampare "HAI SBALLATO!"
                 *  */
            } else {
                Giocatore banco = new Giocatore();
                banco.riceviCarta(mazzo.estraiCarta());
                banco.riceviCarta(mazzo.estraiCarta());
                while (banco.getPunteggio() < 17) {
                    /*TODO:
                     * - far continuare il banco finché non ha un punteggio migliore del giocatore o finché non sballa
                     *  */
                }
                int punteggioBanco = banco.getPunteggio();
                /*TODO:
                 * - stampare i punteggi di entrambi
                 *  */
                if (punteggio > punteggioBanco || punteggioBanco > 21) {
                    /*TODO:
                     * - stampare "hai vinto" e aggiungere i soldi vinti a quelli precedenti
                     *  */
                } else if (punteggio == punteggioBanco) {
                    /*TODO:
                     * - stampare "pareggio" e restituire i soldi al giocatore
                     *  */
                } else {
                    /*TODO:
                     * - stampare "hai perso"
                     *  */
                }
            }
        }
        /*TODO:
         * - stampare "hai finito i soldi"
         *  */
    }
}
