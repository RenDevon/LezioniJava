public class mains {

    public static void main(String[] args) {
        Guerriero conan = new Guerriero("Conan", 100, "Ascione");
        Guerriero dartagnan = new Guerriero("Dartagnan", 100, "Ascione");

//        conan.getName();
//        conan.cammina();
//        dartagnan.cammina();
//
//        conan.attacca(dartagnan);
//        conan.attacca(dartagnan);
//        conan.attacca(dartagnan);
//        conan.attacca(dartagnan);
//        conan.attacca(dartagnan);

        int numeroIntero = 432000000;
        short numeroShort = 10000;
        byte numeroByte = 100;
        long numeroLong = 1L;

        double numeroConVirgola = 1.23;
        double uno = 1;
        double due = 2;
        double risultato = uno / due;
        System.out.println(risultato);
        float numerofloat = 1.23f;

        String valoreAlfanumerico = "123!abc";

        boolean sonoVeroOFalso = 0 == 0; // True
        boolean sonoVeroOFalso2 = 0 != 0; // False
    }
}
