import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mains {

    public static void main(String[] args) {
        String occhio = ";scemo;beppe;scemo;enrico;mel;ytyty;";
        occhio = occhio.substring(1);
        List<String> arreyDiStringhe = Arrays.asList(occhio.split(";"));
        List<String> nuovoArray = new ArrayList<>(arreyDiStringhe);
        nuovoArray.add("genoveffa");
//        System.out.println(arreyDiStringhe.size());
        String variabileDappoggio = "";
        for (int i = 0; i < nuovoArray.size(); i++) {

            for (int x = 0; x < nuovoArray.size(); x++) {

                if (nuovoArray.get(i).equals( nuovoArray.get(x))) {
                    System.out.println("minchia, è uguale!");
                }
                System.out.println(nuovoArray.get(i));
            }
            ;

//            variabileDappoggio = arreyDiStringhe.get(i);
//            if(variabileDappoggio == arreyDiStringhe.get(i + 1)){
//
//            }

        }


    }
}
