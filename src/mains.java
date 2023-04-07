import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mains {

    public static void main(String[] args) {
        String gente = ";scemo;beppe;scemo;enrico;mel;";
        gente = gente.substring(1);
        List<String> arrayDiStringhe = Arrays.asList(gente.split(";"));
        List<String> nuovoArray = new ArrayList<>(arrayDiStringhe);

       List<String> robaDaLevare = nuovoArray;
       robaDaLevare.remove("scemo");

  //      String variabileDappoggio = "";
        for (int i = 0; i < nuovoArray.size(); i++) {

            for (int x = 0; x < nuovoArray.size(); x++) {

                if (nuovoArray.get(i).equals(nuovoArray.get(x))){
                    System.out.println(robaDaLevare.get(i));
        //            System.out.println(arrayDiStringhe.get(i));
                }

            }
        }


    }

}