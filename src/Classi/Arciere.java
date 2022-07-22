package Classi;

import Armi.Arco;

public class Arciere {

    private String name;
    private int hitPoints;
    private int deterxityPoints;
    private Arco arco;
    private int bonusDannoTemporaneo;

    private int contatoreAttacchi;

    public Arciere(String name, int hitPoints, int deterxityPoints, Arco arco) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.deterxityPoints = deterxityPoints;
        this.arco = arco;
        this.bonusDannoTemporaneo = 0;
        this.contatoreAttacchi = 0;
    }

    public void prendereBeneLaMira() {
        System.out.println(name + " prende bene la mira");
        this.bonusDannoTemporaneo = 25;
    }

    public void attaccaConFrecciaMagica(Guerriero nemico) {
        if (!arco.isMagic()) {
            System.out.println(name + " urla: 'porca troia questo arco non e' magico!'");
            return;
        }
        if (deterxityPoints <= 0) {
            System.out.println(name + " è troppo stanco per usare questa abilità!");
            return;
        }
        System.out.println("KAMEHAMEHA!");
        bonusDannoTemporaneo += 1000;
        attacca(nemico);
    }


    public void attacca(Guerriero nemico) {
        if (nemico.getHitPoint() <= 0) {
            System.out.println(name + " ride: 'Ah-ha! Sei crepato bastardo!'");
            return;
        }

        contatoreAttacchi++;
        int puntiFeritaNemico = nemico.getHitPoint();
        int danno = arco.getDamage() + bonusDannoTemporaneo;

        System.out.println(name + " scocca una freccia con " + arco.getName() + " e infligge " + danno + " danni a " + nemico.getName());

        nemico.setHitPoint(puntiFeritaNemico - danno);

        if (contatoreAttacchi == 0) {
            sfottiAvversario("'Combatti, fellone!'");
        }
        if (contatoreAttacchi == 1) {
            sfottiAvversario("'Tua madre e' cosi grassa, ma cosi grassa, che la centrerei con una freccia anche bendato'");
        }
        if (contatoreAttacchi == 2) {
            sfottiAvversario("'Tuo padre non sa di essere un gran cornuto, ma tu di certo si!'");
        }
        if (contatoreAttacchi == 3) {
            sfottiAvversario("'Non c'e' due senza tre, e io godo come un re!'");
        }
        if (contatoreAttacchi == 3) {
            sfottiAvversario("'Huuuuuu, ho perso il conto delle frecce che ti ho infilato nel culo!'");
            contatoreAttacchi = 0;
        }
    }

    public void sfottiAvversario(String insulto) {
        System.out.println(this.name + " urla da lontano:" + insulto);
        System.out.println(this.name + " fa un gestaccio mostrando le chiappe");
    }

    public void cambiaArco(Arco arco) {
        System.out.println(name + " cambia " + this.arco.getName() + " con " + arco.getName());
        this.arco = arco;
    }

    public void bestemmia() {
        System.out.println(name + " urla: questo " + arco.getName() + " non fa un cazzo!");
    }
}
