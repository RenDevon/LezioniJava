import java.util.Arrays;
import java.util.List;

public class mains {

    public static void main(String[] args) {
        String occhio = ";scemo;beppe;scemo;enrico;mel;ytyty;";
        occhio = occhio.substring(1);
        List<String> arreyDiStringhe = Arrays.asList(occhio.split(";"));

//        System.out.println(arreyDiStringhe.size());
        String variabileDappoggio = "";
        for (int i = 0; i < arreyDiStringhe.size(); i++) {

            for (int x = 0; x < arreyDiStringhe.size(); x++) {

                if (arreyDiStringhe.get(i).equals( arreyDiStringhe.get(x))) {
                    System.out.println("minchia, è uguale!");
                }
                System.out.println(arreyDiStringhe.get(i));
            }
            ;

//            variabileDappoggio = arreyDiStringhe.get(i);
//            if(variabileDappoggio == arreyDiStringhe.get(i + 1)){
//
//            }

        }


    }
}
