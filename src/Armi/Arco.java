package Armi;

public class Arco {

    String name;
    int damage;
    boolean magic;


    public Arco(String name, int puntiDanno, boolean magic) {
        this.name = name;
        this.damage = puntiDanno;
        this.magic = magic;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isMagic() {
        return magic;
    }

    public void setMagic(boolean magic) {
        this.magic = magic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
