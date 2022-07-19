public class Guerriero {

    private String name;
    private int hitPoint;
    private String arma;

    public Guerriero(String name, int hitPoint, String arma) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.arma = arma;
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public String getArma() {
        return arma;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void cammina() {
        System.out.println(this.name + " cammina");
    }

    public void muori() {
        if(hitPoint <= 0){
            System.out.printf(this.name + " è morto");
        } else {
            System.out.println(this.name + " sta benone");
        }
    }

    public void attacca(Guerriero nemico) {
        nemico.setHitPoint(nemico.getHitPoint() - 20);
        nemico.muori();
    }
}
