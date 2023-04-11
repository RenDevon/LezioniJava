package difficili.blackjack;

class Carta {
    private int valore;
    public Carta(int valore) {
        this.valore = valore;
    }

    public int getValore() {
        //TODO se valore > 10 ritorna 10
        return this.valore;
    }

    @Override
    public String toString() {
        String nomeValore;
        if (this.valore == 1) {
            nomeValore = "Asso";
        } else if (this.valore == 11) {
            nomeValore = "Jack";
        } else if (this.valore == 12) {
            nomeValore = "Regina";
        } else if (this.valore == 13) {
            nomeValore = "Re";
        } else {
            nomeValore = Integer.toString(this.valore);
        }
        return nomeValore;
    }
}
