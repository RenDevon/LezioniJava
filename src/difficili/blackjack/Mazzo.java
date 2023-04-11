package difficili.blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Mazzo {
    private ArrayList<Carta> carte;

    public Mazzo() {
        this.carte = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                this.carte.add(new Carta(i));
            }
        }
    }

    public void mescola() {
        Collections.shuffle(this.carte);
    }

    public Carta estraiCarta() {
        return this.carte.remove(0);
    }
}

