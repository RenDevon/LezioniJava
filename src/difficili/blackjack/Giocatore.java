package difficili.blackjack;

import java.util.ArrayList;

public class Giocatore {

    private ArrayList<Carta> carte;

    public Giocatore() {
        this.carte = new ArrayList<>();
    }

    public void riceviCarta(Carta carta) {
        //TODO aggiungi carta alle carte
    }

    public int getPunteggio() {
        int punteggio = 0;
        boolean haAsso = false;
        for (Carta carta : this.carte) {
            //TODO se carta == 1 haAsso = true
            punteggio += carta.getValore();
        }
        if (haAsso && punteggio + 10 <= 21) {
            punteggio += 10;
        }
        return punteggio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Carta carta : this.carte) {
            sb.append(carta).append(", ");
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }

}
