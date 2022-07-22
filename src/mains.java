import Armi.Arco;
import Classi.Arciere;
import Classi.Guerriero;
import Classi.Mago;

public class mains {

    public static void main(String[] args) {
        Guerriero conan = new Guerriero("Conan", 1000, "Ascione");
        Arco unArcoMarcio = new Arco("Arco Briaho",30,  false);
        Arco unArcoMitico = new Arco("Arco Super StraMitico!", 100,  true);
        Arciere lerciolas = new Arciere("Lerciolas", 30, 100, unArcoMarcio);

        lerciolas.sfottiAvversario("Sei uno sficheto!");
        lerciolas.attacca(conan);
        lerciolas.prendereBeneLaMira();
        lerciolas.attacca(conan);
        lerciolas.attaccaConFrecciaMagica(conan);
        lerciolas.bestemmia();
        lerciolas.cambiaArco(unArcoMitico);
        lerciolas.attaccaConFrecciaMagica(conan);
        lerciolas.attacca(conan);
        lerciolas.attacca(conan);
    }
}
